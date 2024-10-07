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
     imagem:'https://0aa51baabf7566476cd2-736369e37fca9c51db6ab510561606c6.ssl.cf1.rackcdn.com/60741803_l.jpg', // Picture Águia-calva
     nome:'Águia-Calva', // Title
     nomecientifico:'Haliaeetus leucocephalus', // Subtitle
     habitat:'A águia-calva, símbolo nacional dos Estados Unidos, é encontrada em regiões próximas a rios, lagos e oceanos, em todo o continente norte-americano.',
     caracteristicas:'Essa águia é facilmente reconhecida por sua plumagem branca na cabeça e cauda, contrastando com o corpo marrom escuro. Possui uma visão extremamente aguçada, que a ajuda a localizar suas presas a grandes distâncias.',
     reproducao:'As águias-calvas formam pares monogâmicos e constroem ninhos massivos que podem ser usados por muitos anos. A fêmea geralmente põe de 1 a 3 ovos, que são incubados por ambos os pais.',
    },
    {
     imagem:'https://avatars.mds.yandex.net/i?id=1989362a356f8c1a06a39f7324b25775a497d44a-4234038-images-thumbs&n=13', //Harpia
     nome:'Harpia',
     nomecientifico:'Aquila chrysaetos',
     habitat:'A harpia ou gavião-real é uma ave bastante adaptável e pode ser encontrado em diversos habitats, desde montanhas rochosas até florestas boreais. Eles preferem áreas com penhascos para construir seus ninhos e ter uma boa visão panorâmica para caçar.',
     caracteristicas:' O gavião-real é uma ave majestosa e poderosa, com uma envergadura que pode chegar a mais de 2 metros. Sua plumagem é marrom escura, com algumas penas douradas na nuca, o que lhe rendeu o nome "chrysaetos". Suas garras são extremamente fortes e seu bico é curvo e afiado.',
     reproducao:'Os gaviões-reais são aves monogâmicas e constroem ninhos enormes em penhascos ou em árvores altas. A fêmea geralmente põe de 1 a 3 ovos, incubados por ambos os pais.',
    },
   {
    imagem:'https://avatars.mds.yandex.net/i?id=20c8bd8f4634eac50086d9590f1721b475b8e2c3-4410421-images-thumbs&n=13', //Falcão-Peregrino
    nome:'Falcão-Peregrino',
    nomecientifico:'Falco peregrinus',
    habitat:'O falcão-peregrino é uma ave cosmopolita, ou seja, pode ser encontrada em todos os continentes, exceto na Antártida. Ele habita uma grande variedade de ambientes, desde áreas costeiras até montanhas.',
    caracteristicas:'O falcão-peregrino é famoso por ser a ave mais rápida do mundo! Ele pode atingir velocidades incríveis em seus mergulhos para caçar, chegando a mais de 300 km/h. Sua plumagem é cinza-azulada nas partes superiores e branca nas partes inferiores, com algumas listras escuras.',
    reproducao:'O falcão-peregrino também é uma ave monogâmica e constrói seus ninhos em locais elevados e inacessíveis, como penhascos ou edifícios altos. A fêmea geralmente põe de 3 a 4 ovos, que são incubados por ambos os pais.',
  },
  {
    imagem:'https://primamediamts.servicecdn.ru/f/main/988/987395.jpg?2090c6698e293d2e3c6f361e6024ef48', //Pipargo-Gigante
    nome:'Pipargo-Gigante',
    nomecientifico:'Haliaeetus pelagicus pelagicus',
    habitat:'O pipargo-gigante prefere habitats abertos como estepes, campos e áreas agrícolas. Ele constrói seus ninhos no chão, geralmente em locais com vegetação densa para camuflagem.',
    caracteristicas:'O pipargo gigante é uma ave de rapina de médio porte, conhecida por suas longas asas e cauda. Sua plumagem é marrom-acinzentada, com partes inferiores mais claras. Ele possui uma visão excepcional, o que o ajuda a localizar suas presas de longe.',
    reproducao:'O pipargo gigante é uma ave migratória que nidifica em colônias. A fêmea põe de 3 a 6 ovos, que são incubados por ambos os pais. Os filhotes dependem dos pais para receber comida.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/i?id=0b901ac0459216640b9109e738da3ad2-4481877-images-thumbs&ref=rim&n=33&w=267&h=200', //Águia-Audaz
    nome:'Águia-Audaz',
    nomecientifico:'Aquila audax',
    habitat:'A águia-audaz, a maior ave de rapina da Austrália, prefere habitats abertos como planícies, savanas e áreas montanhosas. Ela constrói seus ninhos em árvores altas ou em penhascos, em locais isolados.',
    caracteristicas:'Essa águia é um verdadeiro gigante, com uma envergadura que pode chegar a quase 3 metros! Sua plumagem é marrom escura, com algumas penas douradas na nuca. Suas garras são extremamente fortes e seu bico é poderoso, permitindo-lhe capturar presas grandes e fortes.',
    reproducao:'A águia-audaz é uma ave monogâmica e constrói ninhos enormes em locais de difícil acesso. A fêmea geralmente põe de 1 a 2 ovos, que são incubados por ambos os pais. Os filhotes nascem cobertos por um penugem branca e dependem dos pais por um longo período.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/i?id=cb0487d6553c6b3fd79628e4f7f79b00a832cfd6-5233124-images-thumbs&ref=rim&n=33&w=230&h=200', //Secretário
    nome:'Serpentário',
    nomecientifico:'Circaetus serpentarius',
    habitat:' O serpentário, também conhecido como águia-secretária, habita savanas e áreas abertas da África. Ele passa a maior parte do tempo no chão, onde caça suas presas.',
    caracteristicas:'Essa ave é única e facilmente reconhecível por sua longa cauda e pernas finas. Sua plumagem é cinza-escura, com partes inferiores mais claras. Ele possui uma crista de penas na cabeça e olhos amarelos brilhantes.',
    reproducao:'O serpentário constrói ninhos volumosos em árvores altas. A fêmea geralmente põe 1 ou 2 ovos, que são incubados por ambos os pais.',
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
              <Image style={{width: '100%',height: '100%',}} //Draw Urso-Pardo
              source={{uri: 'https://i.pinimg.com/75x75_RS/aa/69/8e/aa698e7918a5d3f66e13964e1d25bbff.jpg', }}/>
              <Text style={styles.text}>Águia-Calva</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(1)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Urso-Polar
              source={{uri: 'https://avatars.mds.yandex.net/i?id=cebd2cb871b7d3731f18a9ef3d5d492c62feebec-9068918-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Harpia</Text>
              </Pressable>
          </View>
      </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(2)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Urso-Panda
              source={{uri: 'https://avatars.mds.yandex.net/i?id=d3de72bfdad4493f49017172cec8b4a0d6880cdf-4303535-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Falcão-Peregrino</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(3)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Urso-Negro-Americano
              source={{uri: 'https://i.pinimg.com/originals/d7/20/4b/d7204b6e686867b1d8b00fd1b6c4c9ab.jpg',}}/>
              <Text style={styles.text}>Pipargo-Gigante</Text>
            </Pressable>
          </View>
        </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(4)}>
              <Image style={{width: '100%',height: '100%',}} //Urso-Cinzento
              source={{uri: 'https://yt3.googleusercontent.com/ytc/AIdro_nx9YohoV9iF913ptsnzSgGwuqNq-87NSyMgrMWnw=s900-c-k-c0x00ffffff-no-rj',}}/>
              <Text style={styles.text}>Águia-Audaz</Text>
            </Pressable>
          </View>
   
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(5)}>
              <Image style={{width: '100%',height: '100%',}} //Urso-Sendo 
              source={{uri: 'https://avatars.mds.yandex.net/i?id=289b65b1d4dee20145a25d4a5c9ecc4e422a52de927bf5f0-12649183-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Serpentário</Text>
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
