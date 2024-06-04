import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Image, Modal, Button, Text, View } from 'react-native';

export default function App() {

  const [horoscopo, setHoroscopo] = useState([
    {nome:'Aries',
     dias:'21/03 a 20/04',
     imagem:'https://www.zodiacpage.com/wp-content/uploads/2018/09/aries.jpg',
     leitura:'Hoje vai ser brabo',
     caracteristicas:'Tu é brabo',
     elemento:'Fogo',
     cores:'Branco e prata',
    },
    {nome:'Touro',
    dias:'21/04 a 20/05',
    imagem:'https://img.goodfon.com/original/1920x1200/8/bc/art-digital-art-colorful-cables-computer-cables-wires-animal.jpg',
    leitura:'Hoje vai ser chatão',
    caracteristicas:'Tu é Indeependência',
    elemento:'Fogo',
    cores:'Branco e prata',
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
      <Button title="Aries" onPress={() => carregar(0)}/>
      <Button title="Touro" onPress={() => carregar(1)}/>

    <Modal visible={visivel} animationType="fade">
      <View style={styles.modal}>
        <Text style={styles.title}>{horoscopo[indiceSelecionado].nome}</Text>
        <Text>{horoscopo[indiceSelecionado].dias}</Text>
        <Text>{horoscopo[indiceSelecionado].leitura}</Text>
        <Text>{horoscopo[indiceSelecionado].caracteristicas}</Text>
        <Text>{horoscopo[indiceSelecionado].elemento}</Text>
        <Text>{horoscopo[indiceSelecionado].cores}</Text>
      <Button title="Voltar" onPress={() => voltar()}/> 
      <Image
      source={{ uri: horoscopo[indiceSelecionado].imagem}} 
      style={styles.img}
      />
      </View>
      </Modal>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  modal: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#fff',
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  Image: {
    width: 200,
    height: 200,
    margin: 20,
  },
});
