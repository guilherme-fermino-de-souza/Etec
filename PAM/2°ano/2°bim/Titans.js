import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Image, Modal, Button, Text, View, Pressable, TouchableOpacity } from 'react-native';

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
    imagem:'https://2.bp.blogspot.com/-k8KiAli8sxI/WL0sPwwq00I/AAAAAAAAN-s/XX2UtJJdqpkSoSRNRGB5PuGX8MnYi2V1gCLcB/w1200-h630-p-k-no-nu/coeus_by_chamakoso-d3h1lzp.jpg',
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
    imagem:'https://1.bp.blogspot.com/-HC1q1Ykzs-I/X2npJVOWhvI/AAAAAAAAxdQ/4-Wn7JXcu1wGeeDV2-g03U8d6x4Ji8nUACLcBGAsYHQ/w1600/J%25C3%25A1peto-Mitologia-Grega.jpg',
    nome:'Jápeto',
    deus:'Mortalidade',
    lacos:'Filho do Céu e da Terra',
    caracteristicas:'Costuma ser tido como o deus-titã  do tempo de vida e da mortalidade, em especial da morte violenta',
    nomegrego:'Iapetós (ferir ou golpear)',
    simbolo:'Morte',
  },
  {
    imagem:'https://cdna.artstation.com/p/assets/images/images/000/261/510/large/mike-azevedo-3.jpg',
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
      <scrollView>
      <Pressable onPress={() => carregar(0)} style={styles.buttonCont}>
          <Image style={{
            width: 100,
            height: 100,
          }} 
                  source={{
                    uri: 'https://images.librotea.com/uploads/media/2017/05/29/los-libros-fundamentales-de-urano-para-la-flm.jpeg',   
                  }}/>
        </Pressable>

        <Pressable onPress={() => carregar(1)} style={styles.buttonCont}>
          <Image style={{
            width: 100,
            height: 100,
          }} 
                  source={{
                    uri: 'https://www.shutterstock.com/shutterstock/photos/2092442179/display_1500/stock-vector-greek-goddess-gaia-logo-design-2092442179.jpg',   
                  }}/>
        </Pressable>

        <Pressable onPress={() => carregar(2)} style={styles.buttonCont}>
          <Image style={{
            width: 130,
            height: 100,
          }} 
                  source={{
                    uri: 'https://i.ytimg.com/vi/HtPrFBxAiCs/hqdefault.jpg',   
                  }}/>
        </Pressable>

        <Pressable onPress={() => carregar(3)} style={styles.buttonCont}>
          <Image style={{
            width: 110,
            height: 120,
          }} 
                  source={{
                    uri: 'https://1.bp.blogspot.com/-MDQnEvpWFN4/YJc_FkE5gvI/AAAAAAAAWZI/EEBGGj9-N8ARnEvLFn3v5pZEilN1Y5wBwCLcBGAsYHQ/s480/coios.png',   
                  }}/>
        </Pressable>

      <Pressable onPress={() => carregar(4)} style={styles.buttonCont}>
          <Image style={{
            width: 120,
            height: 100,
          }} 
                  source={{
                    uri: 'https://pm1.aminoapps.com/6608/08f82683c0e8a5a30b0bcc470a161bdd7f4d6051_00.jpg',   
                  }}/>
        </Pressable>

      <Pressable onPress={() => carregar(5)} style={styles.buttonCont}>
          <Image style={{
            width: 120,
            height: 100,
          }} 
                  source={{
                    uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHGeSC7-45pDXwWkc1VUQfb2TWW3z0rM9qxRXzcjOUHsNs8NO2Q78JuCm4wQL2X0BV4WM&usqp=CAU',   
                  }}/>
        </Pressable>

      <Pressable onPress={() => carregar(6)} style={styles.buttonCont}>
          <Image style={{
            width: 130,
            height: 100,
          }} 
                  source={{
                    uri: 'https://static.wikia.nocookie.net',   
                  }}/>
        </Pressable>

      <Pressable onPress={() => carregar(7)} style={styles.buttonCont}>
          <Image style={{
            width: 130,
            height: 100,
          }} 
                  source={{
                    uri: 'https://i.ytimg.com/vi/HtPrFBxAiCs/hqdefault.jpg',   
                  }}/>
        </Pressable>
      <View style={styles.buttonCont}>
        <Button style={styles.button}
        color="#55038C" 
        title="Cronos" onPress={() => carregar(7)}/>
      </View>

      <Modal visible={visivel} animationType="fade">
        <View style={styles.modal}>
        <View style={styles.img}>
        <Image
        source={{ uri: titans[indiceSelecionado].imagem}} 
        style={styles.image}
        />
        </View>
          <Text style={styles.title}>{titans[indiceSelecionado].nome}</Text>
          <Text style={styles.desc}>{titans[indiceSelecionado].deus}</Text>
          <Text style={styles.desc}>{titans[indiceSelecionado].lacos}</Text>
          <Text style={styles.desc}>{titans[indiceSelecionado].caracteristicas}</Text>
          <Text style={styles.desc}>{titans[indiceSelecionado].nomegrego}</Text>
          <Text style={styles.desc}>{titans[indiceSelecionado].simbolo}</Text>
        <Button title="Voltar" onPress={() => voltar()}/> 
        </View>
        </Modal>
      </scrollView>
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
  img: {
    maxWidth: 700,
    alignItems: 'center',
  },
  image: {
    width: 400,
    height: 300,
    margin: 20,
  },
});
