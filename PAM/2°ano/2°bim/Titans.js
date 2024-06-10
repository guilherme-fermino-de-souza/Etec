import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Image, Modal, Button, Text, View } from 'react-native';

export default function App() {

  const [titans, setTitans] = useState([
    {
     imagem:'https://global-uploads.webflow.com/62f27b69eafac54f0255bab4/646c690ec939a9d01739491c_Cronus.jpg',
     nome:'Urano',
     deus:'Céu',
     lacos:'Deus do firmamento e esposo da Terra',
     caracteristicas:'O mais antigo deus grego e o mais velho deus supremo',
     nomegrego:'Ouranós "o que cobre" ou "o que envolve"',
     simbolo:'Céu estrelado',
    },
    {
     imagem:'https://bucket.mlcdn.com/a/2846/2846371/images/b713390f8ffe473b32873d59cb39d3ba8513189c.jpeg',
     nome:'Gaia',
     deus:'Terra',
     lacos:'Deusa geradora e esposa do Céu',
     caracteristicas:'A segunda divindade primordial e mãe de todos',
     nomegrego:'Gaia',
     simbolo:'Terra e montanhas',
   },
   {
    imagem:'https://bestmif.ru/uploads/1131/21561701762951.jpg',
    nome:'Oceanus',
    deus:'Oceano',
    lacos:'Filho do Céu e da Terra',
    caracteristicas:'Deus das águas e a origem de todas as massas líquidas e fontes de água doce do mundo',
    nomegrego:'Ōkeanós (extensão de água salgada que cobre a maior parte da superfície da Terra)',
    simbolo:'Lagos, rios e mares',
  },
  {
    imagem:'https://elrincondemagic.wordpress.com/wp-content/uploads/2019/04/bearer-of-the-heavens-mtg-art.0.0.jpg',
    nome:'Ceos',
    deus:'Conhecimento',
    lacos:'Filho do Céu e da Terra',
    caracteristicas:'associado a inteligência e ao conhecimento',
    nomegrego:' Céos (Κοίος) — titã das visões e senhor do norte',
    simbolo:'questionador e investigador',
  },
  {
    imagem:'https://i.pinimg.com/originals/f3/69/5b/f3695ba8e62620509231acd521f0d2f8.jpg',
    nome:'Hipérion',
    deus:'Luz',
    lacos:'Filho do Céu e da Terra',
    caracteristicas:'Fonte de toda a iluminação e de sabedoria e vigilância',
    nomegrego:'hyper ("acima") e iôn ("que vai")',
    simbolo:'Luz solar',
  },
  {
    imagem:'https://cogconnected.com/wp-content/uploads/2019/05/sandman-min.jpg',
    nome:'Crios',
    deus:'Constelações',
    lacos:'Filho do Céu e da Terra',
    caracteristicas:'Deus das cosntelações e astrologia',
    nomegrego:'Krios (Carneiro, o que sugere ligação com Aries',
    simbolo:'Constelações',
  },
  {
    imagem:'https://i.pinimg.com/originals/41/4c/83/414c839e392c8175a971782ec4acb5ec.jpg',
    nome:'Jápeto',
    deus:'Mortalidade',
    lacos:'Filho do Céu e da Terra',
    caracteristicas:'Costuma ser tido como o deus-titã  do tempo de vida e da mortalidade, em especial da morte violenta',
    nomegrego:'Iapetós (ferir ou golpear)',
    simbolo:'Morte',
  },
  {
    imagem:'https://cdna.artstation.com/p/assets/images/images/000/261/510/large/mike-azevedo-3.jpg?1443929937',
    nome:'Cronos',
    deus:'Tempo',
    lacos:'Filho do Céu e da Terra',
    caracteristicas:' deus do tempo, sobretudo quando visto em seu aspecto destrutivo, o tempo inexpugnável que rege os destinos e a tudo pode devorar',
    nomegrego:'Cronos (tempo destrutivo e consumador)',
    simbolo:'Relógio',
  },
  ]);

  const [visivel, setVisivel] = useState(false);
  const [indiceSelecionado, setIndiceSelecionado] = useState(0);
  const carregar = (indice) => {
    setIndiceSelecionado(indice);
    setVisivel(true);
  };

  const voltar = () => {
    setVisivel(false);
  };

  return (
    <View style={styles.container}>

     <View style={styles.buttonCont}>
      <Button style={styles.button} 
      color="#55038C" 
      title="Urano" onPress={() => carregar(0)}/>
     </View>

     <View style={styles.buttonCont}>
      <Button style={styles.button} 
      color="#55038C"
      title="Gaia" onPress={() => carregar(1)}/>
     </View>

     <View style={styles.buttonCont}>
      <Button style={styles.button} 
      color="#55038C"
      title="Oceano" onPress={() => carregar(2)}/>
     </View> 

     <View style={styles.buttonCont}>
      <Button style={styles.button}
      color="#55038C" 
      title="Cós" onPress={() => carregar(3)}/>
     </View>

     <View style={styles.buttonCont}>
      <Button style={styles.button}
      color="#55038C" 
      title="Hipérion" onPress={() => carregar(4)}/>
     </View>

     <View style={styles.buttonCont}>
      <Button style={styles.button}
      color="#55038C" 
      title="Crio" onPress={() => carregar(5)}/>
     </View>

     <View style={styles.buttonCont}>
      <Button style={styles.button}
      color="#55038C" 
      title="Jápeto" onPress={() => carregar(6)}/>
     </View>

     <View style={styles.buttonCont}>
      <Button style={styles.button}
      color="#55038C" 
      title="Cronos" onPress={() => carregar(7)}/>
     </View>

    <Modal visible={visivel} animationType="fade">
      <View style={styles.modal}>
      <Image
      source={{ uri: titans[indiceSelecionado].imagem}} 
      style={styles.image}
      />
        <Text style={styles.title}>{titans[indiceSelecionado].nome}</Text>
        <Text style={styles.desc}>{titans[indiceSelecionado].deus}</Text>
        <Text style={styles.desc}>{titans[indiceSelecionado].lacos}</Text>
        <Text style={styles.desc}>{titans[indiceSelecionado].caracteristicas}</Text>
        <Text style={styles.desc}>{titans[indiceSelecionado].nomegrego}</Text>
        <Text style={styles.desc}>{titans[indiceSelecionado].simbolo}</Text>
      <Button title="Voltar" onPress={() => voltar()}/> 
      </View>
      </Modal>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'black',
    alignItems: 'center',
    justifyContent: 'center',
  },
  buttonCont: {
    marginBottom: 20,
  },
  button: {
    fontSize: 80,
    color:'#FFE74A',
  },
  modal: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'black',
  },
  title: {
    fontSize: 24,
    fontWeight: 800,
    marginBottom: 30,
    color: 'white',
  },
  desc: {
    fontSize: 16,
    color: 'white',
    fontWeight: 500,
    marginBottom: 15,
    textAlign: 'center',
  },
  image: {
    width: 700,
    height: 600,
    margin: 20,
  },
});
