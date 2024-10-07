import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, Pressable, View } from 'react-native';
import { Modal, ScrollView } from 'react-native-web';
import { Button,Image } from 'react-native-web';
import { useState } from 'react';
import styles from './style.js'

export default function AvesdeRapina() {
// Canideos
  const [animais, setanimais] = useState([
    {
     imagem:'https://www.greenpeace.ch/static/planet4-switzerland-stateless/2019/05/19359e38-19359e38-gp01qtt_press-1024x668.jpg', //Baleia-Azul
     nome:'Baleia-Azul', // Title
     nomecientifico:'Balaenoptera musculus', // Subtitle
     habitat:'As baleias-azuis habitam os oceanos abertos, preferindo águas frias e ricas em nutrientes. Elas realizam longas migrações entre as áreas de alimentação e reprodução.',
     caracteristicas:'São os maiores animais que já existiram na Terra, medindo até 30 metros de comprimento e mais de 180t de peso, com um corpo esguio e barbatanas longas. Alimentam-se de pequenos crustáceos, filtrando a água através de suas barbatanas.',
     reproducao:'As baleias-azuis têm um período de gestação de cerca de um ano. A fêmea dá à luz a um único filhote, que pode pesar várias toneladas ao nascer. Os filhotes crescem rapidamente, alimentando-se do leite materno extremamente rico em gordura.',
    },
    {
     imagem:'https://avatars.mds.yandex.net/i?id=1bb8f70b971a67b401e0cc494a6b45aaeed57faf-10636511-images-thumbs&ref=rim&n=33&w=320&h=200', //Baleia-Jubarte
     nome:'Baleia-Jubarte',
     nomecientifico:'Megaptera novaeangliae',
     habitat:'Altamente semelhante ao habitat das baleias-azuis, as baleias-jubarte são encontradas em todos os oceanos do mundo, mas preferem águas mais frias. Elas migram longas distâncias entre as áreas de alimentação e reprodução.',
     caracteristicas:'São conhecidas por suas longas nadadeiras peitorais e seus cantos complexos. Alimentam-se de peixes e pequenos crustáceos, usando suas barbatanas para filtrar a água.',
     reproducao:'As fêmeas dão à luz a um único filhote a cada dois ou três anos. Os filhotes nascem com cerca de 4 a 5 metros de comprimento e são amamentados por cerca de um ano.',
    },
   {
    imagem:'https://i.pinimg.com/736x/2c/85/bf/2c85bf1b4089f5ce01845434c4703fee.jpg', //Baleia-Comum
    nome:'Baleia-Comum',
    nomecientifico:'Balaenoptera physalus',
    habitat:'As baleias-comuns habitam todos os oceanos, exceto o Ártico. Elas são encontradas tanto em águas costeiras quanto em alto-mar.',
    caracteristicas:'São o segundo maior animal do planeta, com um corpo esguio e uma mancha branca característica na mandíbula inferior. Alimentam-se de uma variedade de presas, incluindo peixes e pequenos crustáceos.',
    reproducao:'A gestação dura cerca de um ano, e a fêmea dá à luz a um único filhote. Os filhotes crescem rapidamente, alimentando-se do leite materno.',
  },
  {
    imagem:'https://www.ekogazeta.uz/uploads/2018-06-07/reports/124/15283644774-11.jpg', //Baleia-de-Bryde
    nome:'Baleia-de-Bryde',
    nomecientifico:'Balaenoptera brydei',
    habitat:'As baleias-de-Bryde são encontradas em todos os oceanos tropicais e subtropicais.',
    caracteristicas:'São animais sociais que vivem em grupos. Alimentam-se de uma variedade de presas, incluindo peixes e pequenos crustáceos.',
    reproducao:'Pouco se sabe sobre a reprodução da baleia-de-Bryde, mas acredita-se que seja similar à de outras baleias-baleia.',
  },
  {
    imagem:'https://tomandcandice.files.wordpress.com/2009/07/p7270975.jpg', //Baleia-Sei
    nome:'Baleia-Sei',
    nomecientifico:'Balaenoptera borealis',
    habitat:'Pode ser encontrada em todo o mundo, em todos os oceanos e mares adjacentes, e prefere águas profundas mais afastadas da costa. Elas são encontradas tanto em águas costeiras quanto em alto-mar, sendo consideradas o terceiro maior balenopterídeo do mundo.',
    caracteristicas:'São animais esguios e rápidos, com um corpo capaz de mover-se pelos oceanos com a liberdade de ação de uma ave nos céus. Alimentam-se principalmente de pequenos crustáceos.',
    reproducao:'A gestação dura cerca de um ano, e a fêmea dá à luz a um único filhote. Os filhotes crescem rapidamente, alimentando-se do leite materno.',
  },
  {
    imagem:'https://i.pinimg.com/originals/d5/92/ac/d592acfe4bb1fa06325a2b7dedd000e4.jpg', //Baleia-de-Minke
    nome:'Baleia-de-Minke',
    nomecientifico:'Balaenoptera acutorostrata',
    habitat:'As baleias-de-minke são encontradas em todos os oceanos, portanto sendo uma espécie cosmopolita que ocorre tanto na zona costeira como na oceânica. No Brasil ocorre ao longo de toda a costa, do Pará ao Rio Grande do Sul.',
    caracteristicas:'São as menores das baleias dentro da ordem dos Misticetos. Atingem cerca de 11m de comprimento e pesam aproximadamente 14 toneladas. Possuem dorso escuro e ventre claro. Apresentam uma listra branca nas nadadeiras peitorais. Costumam se concentrar nas águas próximas aos polos durante o verão para se alimentarem de krill e pequenos peixes.',
    reproducao:'Reproduzem-se por meio de fecundação interna, ou seja, o macho introduz o espermatozoide dentro do corpo da fêmea. O filhote desenvolve-se dentro do útero da fêmea, e o tempo de gestação varia de acordo com cada espécie, entretanto, a média é de onze a doze meses.',
  },
  ])

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
      <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(0)} >
              <Image style={{width: '100%',height: '100%',}} //Draw Baleia-Azul
              source={{uri: 'https://i.pinimg.com/originals/f6/3d/5c/f63d5c7066dd9873936dabbf13a398f0.jpg', }}/>
              <Text style={styles.text}>Baleia-Azul</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(1)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Baleia-Jubarte
              source={{uri: 'https://avatars.mds.yandex.net/i?id=51b58127468774c9963567a5edda57c2-4866644-images-thumbs&ref=rim&n=33&w=200&h=200',}}/>
              <Text style={styles.text}>Baleia-Jubarte</Text>
              </Pressable>
          </View>
      </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(2)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Baleia-Comum
              source={{uri: 'https://avatars.mds.yandex.net/i?id=993982455924fb9235e288e8b7cd814a831e2c37-10093836-images-thumbs&ref=rim&n=33&w=300&h=200',}}/>
              <Text style={styles.text}>Baleia-Comum</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(3)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Baleia-de-Bryde
              source={{uri: 'https://cdn.divessi.com/cached/Wildlife_Brydes_Whale_Alamy-Nature-Picture-Library.jpg/400.jpg',}}/>
              <Text style={styles.text}>Baleia-de-Bryde</Text>
            </Pressable>
          </View>
        </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(4)}>
              <Image style={{width: '100%',height: '100%',}} //Urso-Cinzento
              source={{uri: 'https://ilyatoo.com/objets/mondeduvivants/zoom%20BALEINE%20BLEUE.jpg',}}/>
              <Text style={styles.text}>Baleia-Sei</Text>
            </Pressable>
          </View>
   
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(5)}>
              <Image style={{width: '100%',height: '100%',}} //Urso-Sendo 
              source={{uri: 'https://avatars.dzeninfra.ru/get-zen_doc/3324118/pub_623d8b2096ad2e34260b90f2_623d8b4291a2b12dfb33a6e9/scale_1200',}}/>
              <Text style={styles.text}>Baleia-de-Minke</Text>
            </Pressable>
          </View>
        </View>

        <ScrollView>
        <Modal visible={visivel} animationType="fade">
          <View style={styles.modal}>
          <View style={styles.imagemContainer}>
          <Image
          source={{ uri: animais[indiceSelecionado].imagem}} 
          style={styles.image}
          />
          </View>
            <Text style={styles.title}>{animais[indiceSelecionado].nome}</Text>
            <Text style={styles.secondTitle}>{animais[indiceSelecionado].nomecientifico}</Text>
            <Text style={styles.subTitles}>Habitat</Text>
            <Text style={styles.description}>{animais[indiceSelecionado].habitat}</Text>
            <Text style={styles.subTitles}>Caracteristicas</Text>
            <Text style={styles.description}>{animais[indiceSelecionado].caracteristicas}</Text>
            <Text style={styles.subTitles}>Reprodução</Text>
            <Text style={styles.description}>{animais[indiceSelecionado].reproducao}</Text>
          <Button title="Voltar" onPress={() => voltar()}/> 
          </View>
        </Modal>
        </ScrollView>
    </View>
  );
}
