import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Text, View } from 'react-native';
import { TouchableOpacity } from 'react-native-web';
  
export default function App() {
  //Frase apresentada
  const [impressao, setImpressao] = useState("")
    //Número da imagem exposta
  const[img, setImg] = useState(0)

  const frases = [
    'Seja como for o que penses, creio que é melhor dizê-lo com boas palavras.',
    'Um homem não é outra coisa senão o que faz de si mesmo.',
    'O que importa afinal, viver ou saber que se está vivendo?',
    'A vida é maravilhosa se não se tem medo dela.',
    'Quero a delícia de poder sentir as coisas mais simples.',
    'Tenho em mim todos os sonhos do mundo.',
    'O homem não morre quando deixa de viver, mas sim quando deixa de amar.',
    'Aquilo que se faz por amor está sempre além do bem e do mal',
    'Ainda não vi ninguém que ame a virtude tanto quanto ama a beleza do corpo.',
    'As flores desabrocham para continuar a viver, pois reter é perecer.',
    'Não é difícil morrer nesta vida. Viver é muito mais difícil.',
    'Escuta e serás sábio. O começo da sabedoria é o silêncio.',
    'Se as pessoas falam de você pelas costas, fique feliz que você está na frente.',
    'De que serve ao homem conquistar o mundo inteiro se perder a alma?',
    'As melhores coisas na vida não são coisas.',
    'O medo é um preconceito dos nervos. E um preconceito, desfaz-se; basta a simples reflexão.'
  ];

  function quebrar(){
    if(img == 0){
      let numAleatorio = Math.floor(Math.random() * frases.length);
      setImpressao(frases[numAleatorio])
      setImg(1)
    }
  }

  function novo(){
    setImpressao(frases[''])
    setImg(0)
  }

  function exibirImagem(numero){
    if(numero == 0){
      return(<image source={require('./assets/biscuInt.jpeg')} style={styles.img}/>)
    } else{
        return(<image source={require('./assets/biscuÍdo.jpeg')} style={styles.img}/>)
    }
  }

  return(
  <View style={styles.container}>
      <View style={{borderWidth:1, flex:2, justifyContent:'center', alignItems:'center', width:'100%'}}>
        {exibirImagem(img)}
      </View>
      <View style={{borderWidth:1, flex:2, justifyContent:'center', alignItems:'center', width:'100%'}}>
        <Text style={styles.textFrase}>{impressao}</Text>
      </View>
      <View style={{borderWidth:1, flex:2, justifyContent:'center', alignItems:'center', width:'100%'}}>
        <TouchableOpacity style={styles.botao} onPress={()=>quebrar()}>
          <View style={styles.btnArea}>
            <Text style={styles.btnTexto}>Quebrar bolacha.</Text>
          </View>
      </TouchableOpacity>
       <TouchableOpacity style={styles.botao} onPress={()=>novo()}>
        <View style={styles.btnArea}>
           <Text style={styles.btnTexto}>Nova bolacha</Text>
        </View>
      </TouchableOpacity>
     </View>
  </View>
    )
  }


const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  img: {
    height:250,
  }, 
  textFrase:{
    fontSize: 20,
    color:'#dd7b22',
    margin:30,
    fontStyle:'italic',
    textAlign:'center',
  },
  botao:{
    width:230,
    height:50,
    borderWidth:2,
    borderColor:'#dd7b22',
    borderRadius:25,
    margin:10
  },
  botao:{
    width:230,
    height:50,
    borderWidth:2,
    borderColor:'#dd7b22',
    borderRadius:25,
    margin:10
  },
  btnArea:{
    flex:1,
    alignItems:'center',
    justifyContent:'center'
  },
btnTexto:{
  color:'#dd7b22',
  fontSize:18,
  fontWeight:'bold'
}
//messi
});

/*<View style={styles.container}> //Func exibirImagem retornará img biscuit
<Text>Open up App.js to start working on your app!</Text> //Frase sorteada
<StatusBar style="auto" />  Func quebrar| - Removerá a frase e altera *img biscuÍdo* p/ *img biscuInt*
</View> Func quebrar| - Optará por nova frase e altera *img biscuInt* p/ *img biscuÍdo* 
);*/
