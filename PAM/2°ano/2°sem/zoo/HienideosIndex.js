import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, Pressable, View } from 'react-native';
import { Modal, ScrollView } from 'react-native-web';
import { Button,Image } from 'react-native-web';
import { useState } from 'react';
import styles from './style.js'

export default function Hienideos() {
// Hienideos
  const [animais, setanimais] = useState([
    {
        imagem: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR61IU2j6IOdW1uPGi23y-gFYEK6Jh4k5lUmg&s', // Hiena Manchada
        nome: 'Hiena Manchada',
        nomecientifico: 'Crocuta crocuta',
        habitat: 'Encontrada em savanas, pastagens e regiões semiáridas da África. Elas preferem áreas abertas onde possam caçar.',
        caracteristicas: 'Possuem uma pelagem manchada que varia de amarelo a marrom escuro. São conhecidas por sua mandíbula poderosa, capaz de triturar ossos, e por seu vocalizador "riso".',
        reproducao: 'As fêmeas dão à luz de 1 a 4 filhotes após uma gestação de cerca de 110 dias. Os filhotes nascem cegos e dependem da mãe até os seis meses.',
      },
      {
        imagem: 'https://st.depositphotos.com/1638880/4813/i/950/depositphotos_48135959-stock-photo-striped-hyena.jpg', // Hiena Listrada
        nome: 'Hiena Listrada',
        nomecientifico: 'Hyaena hyaena',
        habitat: 'Habita áreas de savana, montanhas e florestas em partes da África e da Ásia. Prefere locais com cobertura densa para se esconder.',
        caracteristicas: 'Menor que a hiena manchada, a hiena listrada tem um corpo mais esguio e um padrão de listras distintas em seu pelo. Elas são mais solitárias e possuem um forte olfato.',
        reproducao: 'A fêmea geralmente dá à luz de 1 a 4 filhotes após um período de gestação de cerca de 90 a 100 dias, e os filhotes são cuidados pela mãe até cerca de um ano de idade.',
      },
      {
        imagem: 'https://thumbs.dreamstime.com/b/protele-proteles-cristatus-aardwolf-adulto-correndo-172733199.jpg', // Hiena da Terra
        nome: 'Hiena da Terra',
        nomecientifico: 'Proteles cristata',
        habitat: 'É encontrada em savanas abertas e áreas áridas na África, onde sua dieta se concentra principalmente em insetos.',
        caracteristicas: 'Menor que outras hienas, com uma aparência mais semelhante a um gato. Possui um corpo ágil e é conhecida por sua habilidade em escavar.',
        reproducao: 'A reprodução ocorre durante todo o ano, com um período de gestação de cerca de 60 a 70 dias. As fêmeas geralmente dão à luz de 2 a 4 filhotes.',
      },
      {
        imagem: 'https://c8.alamy.com/comp/2X3BW4M/the-cave-hyena-crocuta-crocuta-spelaea-exhibition-eiszeit-safari-allgaeu-in-the-marstall-kempten-allgaeu-bavaria-germany-2X3BW4M.jpg', // Hiena das Cavernas (Extinta)
        nome: 'Hiena das Cavernas (Extinta)',
        nomecientifico: 'Hyaena spelea',
        habitat: 'Viveu em cavernas e regiões montanhosas na Europa durante o Pleistoceno. Fosséis indicam que se adaptavam a climas frios.',
        caracteristicas: 'Tinha um corpo robusto e era maior que as hienas modernas, com adaptações para a caça em ambientes gelados.',
        reproducao: 'Não há informações detalhadas sobre a reprodução, mas é provável que tivesse hábitos semelhantes às hienas modernas, com cuidados maternais para os filhotes.',
      },
      {
        imagem: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCHRZUOuWzHEBrJBzjtPhD7_RQrDx4eHhF0w&s', // Hiena da Somália
        nome: 'Hiena da Somália',
        nomecientifico: 'Hyaena hyaena somalica',
        habitat: 'Encontrada em habitats semiáridos e savanas na região da Somália e partes do Corno da África.',
        caracteristicas: 'Apresenta uma pelagem mais clara e adaptada ao clima árido. É conhecida por suas habilidades de caça em grupo.',
        reproducao: 'O período de gestação é semelhante ao da hiena listrada, com os filhotes sendo cuidados pela mãe até a independência.',
      },
      {
        imagem: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR77LMLJc8LvxSV7Cv_Q0z0JiMAmC1sorxi0A&s', // Hiena das Cavernas da Ásia 
        nome: 'Hiena das Cavernas da Ásia',
        nomecientifico: 'Crocuta crocuta spelaea (subespécie)',
        habitat: 'Antiga distribuição em áreas da Ásia e Europa, especialmente em cavernas.',
        caracteristicas: 'Semelhante à hiena manchada, mas adaptada a ambientes diferentes, com variações na dieta e no comportamento social.',
        reproducao: 'Informações sobre reprodução são escassas, mas espera-se que sigam padrões semelhantes às hienas modernas.',
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
              <Image style={{width: '100%',height: '100%',}} //Draw Hiena Manchada
              source={{uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPQ8oWcT0CHpqDmWqHm1n66utR3KtA70hlfw&s', }}/>
              <Text style={styles.text}>Hiena Manchada</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(1)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Hiena Listrada
              source={{uri: 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Striped_hyena_%28Hyaena_hyaena%29_-_cropped.jpg/1200px-Striped_hyena_%28Hyaena_hyaena%29_-_cropped.jpg',}}/>
              <Text style={styles.text}>Hiena Listrada</Text>
              </Pressable>
          </View>
      </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(2)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Hiena da Terra
              source={{uri: 'https://upload.wikimedia.org/wikipedia/commons/0/0b/Proteles_cristatus1.jpg',}}/>
              <Text style={styles.text}>Hiena da Terra</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(3)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Hiena das Cavernas
              source={{uri: 'https://s3.animalia.bio/animals/photos/full/1.25x1/heinrichshc3b6hle2c-15.webp?id=39e336b054f92f21223363a70b06dd93',}}/>
              <Text style={styles.text}>Hiena das Cavernas</Text>
            </Pressable>
          </View>
        </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(4)}>
              <Image style={{width: '100%',height: '100%',}} //Hiena da Somália
              source={{uri: 'https://i.pinimg.com/originals/55/f1/42/55f142360a052455a3c57dbe344ec7df.jpg',}}/>
              <Text style={styles.text}>Hiena da Somália</Text>
            </Pressable>
          </View>
   
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(5)}>
              <Image style={{width: '100%',height: '100%',}} //Hiena das Cavernas da Ásia
              source={{uri: 'https://i.pinimg.com/736x/5e/53/7c/5e537cfcfa9eef1e37bdfce61bdb202a.jpg',}}/>
              <Text style={styles.text}>Hiena da Ásia</Text>
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
