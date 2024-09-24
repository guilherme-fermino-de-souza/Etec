import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Image, Modal, Button, Text, View, Pressable, TouchableOpacity, ScrollView } from 'react-native';

export default function App() {

  const [titans, setTitans] = useState([
    {
     imagem:'https://global-uploads.webflow.com/62f27b69eafac54f0255bab4/646c690ec939a9d01739491c_Cronus.jpg',
     nome:'Urano',
     nomecientifico:'nome',
     habitat:'Deus do firmamento e esposo da Terra',
     caracteristicas:'O mais antigo deus grego e o mais velho deus supremo',
    },
    {
     imagem:'https://bucket.mlcdn.com/a/2846/2846371/images/b713390f8ffe473b32873d59cb39d3ba8513189c.jpeg',
     nome:'Gaia',
     nomecientifico:'Terra',
     habitat:'Deusa geradora e esposa do Céu',
     caracteristicas:'A segunda divindade primordial e mãe de todos',
   },
   {
    imagem:'https://bestmif.ru/uploads/1131/21561701762951.jpg',
    nome:'Oceanus',
    nomecientifico:'Oceano',
    habitat:'Filho do Céu e da Terra',
    caracteristicas:'Deus das águas e a origem de todas as massas líquidas e fontes de água doce do mundo',
  },
  {
    imagem:'https://2.bp.blogspot.com/-k8KiAli8sxI/WL0sPwwq00I/AAAAAAAAN-s/XX2UtJJdqpkSoSRNRGB5PuGX8MnYi2V1gCLcB/w1200-h630-p-k-no-nu/coeus_by_chamakoso-d3h1lzp.jpg',
    nome:'Ceos',
    nomecientifico:'Conhecimento',
    habitat:'Filho do Céu e da Terra',
    caracteristicas:'associado a inteligência e ao conhecimento',
  },
  {
    imagem:'https://i.pinimg.com/originals/f3/69/5b/f3695ba8e62620509231acd521f0d2f8.jpg',
    nome:'Hipérion',
    nomecientifico:'Luz',
    habitat:'Filho do Céu e da Terra',
    caracteristicas:'Fonte de toda a iluminação e de sabedoria e vigilância',
  },
  {
    imagem:'https://cogconnected.com/wp-content/uploads/2019/05/sandman-min.jpg',
    nome:'Crios',
    nomecientifico:'Constelações',
    habitat:'Filho do Céu e da Terra',
    caracteristicas:'Deus das cosntelações e astrologia',
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
      <ScrollView>
        <Pressable onPress={() => carregar(0)} style={styles.buttonCont}>
            <Image style={{
              width: 110,
              height: 100,
            }} 
                    source={{
                      uri: 'https://mythology.guru/wp-content/uploads/2023/05/urano-god.jpg',   
                    }}/>
        </Pressable>

        <Pressable onPress={() => carregar(1)} style={styles.buttonCont}>
           <Image style={{
             width: 95,
             height: 110,
           }} 
                  source={{
                     uri: 'https://i.pinimg.com/736x/a1/47/a5/a147a533ac281351ceb0b57817153b21.jpg',   
                   }}/>
         </Pressable>

        <Pressable onPress={() => carregar(2)} style={styles.buttonCont}>
          <Image style={{
             width: 110,
             height: 100,
          }} 
                  source={{
                     uri: 'https://ideasnuevas.net/wp-content/uploads/2019/04/MITOposeidon_water_greek_god_abstract_fantasy_hd-wallpaper-1576510-250x156.jpg',   
                  }}/>
        </Pressable>

        <Pressable onPress={() => carregar(3)} style={styles.buttonCont}>
          <Image style={{
            width: 105,
            height: 120,
          }} 
                  source={{
                    uri: 'https://1.bp.blogspot.com/-MDQnEvpWFN4/YJc_FkE5gvI/AAAAAAAAWZI/EEBGGj9-N8ARnEvLFn3v5pZEilN1Y5wBwCLcBGAsYHQ/s480/coios.png',   
                  }}/>
        </Pressable>

        <Pressable onPress={() => carregar(4)} style={styles.buttonCont}>
          <Image style={{
             width: 110,
            height: 100,
           }} 
                  source={{
                    uri: 'https://pm1.aminoapps.com/6608/08f82683c0e8a5a30b0bcc470a161bdd7f4d6051_00.jpg',   
                  }}/>
        </Pressable>

        <Pressable onPress={() => carregar(5)} style={styles.buttonCont}>
            <Image style={{
              width: 110,
              height: 90,
            }} 
                    source={{
                      uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHGeSC7-45pDXwWkc1VUQfb2TWW3z0rM9qxRXzcjOUHsNs8NO2Q78JuCm4wQL2X0BV4WM&usqp=CAU',   
                    }}/>
        </Pressable>

        <Modal visible={visivel} animationType="fade">
          <View style={styles.modal}>
          <View style={styles.img}>
          <Image
          source={{ uri: titans[indiceSelecionado].imagem}} 
          style={styles.image}
          />
          </View>
            <Text style={styles.title}>{titans[indiceSelecionado].nome}</Text>
            <Text style={styles.desc}>{titans[indiceSelecionado].nomecientifico}</Text>
            <Text style={styles.desc}>{titans[indiceSelecionado].habitat}</Text>
            <Text style={styles.desc}>{titans[indiceSelecionado].caracteristicas}</Text>
          <Button title="Voltar" onPress={() => voltar()}/> 
          </View>
        </Modal>
      </ScrollView>
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
