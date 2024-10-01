import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, Pressable, View } from 'react-native';
import { Modal, ScrollView } from 'react-native-web';
import { Button,Image } from 'react-native-web';
import { useState } from 'react';
import styles from './style.js'

export default function Felinos() {
// Felinos
  const [animais, setanimais] = useState([
    {
     imagem:'https://www.sunhome.ru/i/wallpapers/241/afrikanskii-lev.orig.jpg', // Picture Lion
     nome:'Leão', // Title
     nomecientifico:'Panthera leo', // Subtitle
     habitat:'Os leões, Panthera leo, habitam principalmente savanas, pastagens e florestas abertas. Na África, eles são encontrados em regiões como o Serengeti e o Parque Nacional Kruger, onde as grandes planícies oferecem tanto abrigo quanto presas abundantes.',
     caracteristicas:'Os leões são predadores sociais, vivendo em grupos que facilitam a caça e a proteção dos filhotes. Eles são conhecidos por sua força e agilidade, caçando principalmente grandes herbívoros como zebras e antílopes. Os machos defendem o território, enquanto as fêmeas costumam cuidar dos filhotes e caçar. Além disso, os leões têm uma comunicação complexa, usando rugidos e vocalizações para se organizar e alertar sobre perigos.',
    },
    {
     imagem:'https://bucket.mlcdn.com/a/2846/2846371/images/b713390f8ffe473b32873d59cb39d3ba8513189c.jpeg',
     nome:'Leopardo',
     nomecientifico:'Panthera pardus',
     habitat:'Os leopardos preferem florestas densas, savanas, montanhas e áreas rochosas. Sua habilidade de se adaptar a diferentes tipos de habitat é uma das razões pelas quais eles são tão bem-sucedidos. Eles também são conhecidos por serem excelentes escaladores, frequentemente se escondendo em árvores para descansar e armazenar suas presas, evitando assim concorrência com outros predadores, como leões.',
     caracteristicas:'Leopardos são solitários e territoriais, geralmente marcando seu território com arranhões em árvores e urina. Eles são mais ativos à noite (noturnos), o que os ajuda a evitar concorrência com outros predadores.',
   },
   {
    imagem:'https://bestmif.ru/uploads/1131/21561701762951.jpg',
    nome:'Chita',
    nomecientifico:'Acinonyx jubatus',
    habitat:'As chitas preferem habitats abertos, como savanas, pastagens e áreas semiáridas, onde podem usar sua incrível velocidade para caçar. A vegetação esparsa nesses ambientes facilita a emboscada e a perseguição de presas.',
    caracteristicas:'As chitas são mais sociais do que outros felinos, formando grupos chamados de “coalizões”, que são frequentemente compostos por machos irmãos. Elas são diurnas, caçando durante o dia, e dependem de sua velocidade em vez de força para capturar presas, que incluem gazelas e outros ungulados pequenos.',
  },
  {
    imagem:'https://2.bp.blogspot.com/-k8KiAli8sxI/WL0sPwwq00I/AAAAAAAAN-s/XX2UtJJdqpkSoSRNRGB5PuGX8MnYi2V1gCLcB/w1200-h630-p-k-no-nu/coeus_by_chamakoso-d3h1lzp.jpg',
    nome:'Tigre',
    nomecientifico:'Panthera tigris',
    habitat:'Os tigres preferem habitats densos, como florestas de mangue, florestas tropicais e áreas de vegetação densa, que oferecem cobertura para caça e proteção. Também podem ser encontrados em áreas mais abertas, desde que haja água disponível.',
    caracteristicas:'Os tigres, conhecidos cientificamente como Panthera tigris, são os maiores felinos do mundo, conhecidos por sua força e beleza. Eles habitam principalmente florestas tropicais, savanas e áreas montanhosas na Ásia, com as populações mais significativas na Índia, onde o tigre de Bengala é o mais famoso.',
  },
  {
    imagem:'https://i.pinimg.com/originals/f3/69/5b/f3695ba8e62620509231acd521f0d2f8.jpg',
    nome:'Lince-ibérico',
    nomecientifico:'Lynx pardinus',
    habitat:'O lince-ibérico habita principalmente áreas de matas, florestas e regiões de vegetação densa, como arbustos e matagais. Prefere habitats com boa cobertura para caçar e se esconder, e também depende da presença de água próxima.',
    caracteristicas:'Os linces-ibéricos são solitários e territoriais. Eles se alimentam principalmente de coelhos, que são sua principal fonte de alimento, mas também podem caçar aves e pequenos mamíferos. A espécie está em recuperação devido a esforços de conservação, mas ainda enfrenta ameaças como a perda de habitat e a redução das populações de presas.',
  },
  {
    imagem:'https://cogconnected.com/wp-content/uploads/2019/05/sandman-min.jpg',
    nome:'Onça-pintada',
    nomecientifico:'Panthera onca',
    habitat:'A onça-pintada é encontrada em uma variedade de habitats, incluindo florestas tropicais, savanas, pantanais e áreas de vegetação densa. Ela é mais comum nas florestas da Amazônia, mas também pode ser vista em regiões como o Pantanal e áreas do México até o sul dos Estados Unidos.',
    caracteristicas:'As onças são solitárias e territoriais, caçando principalmente à noite (são noturnas). Sua dieta é variada e inclui presas como capivaras, pecarís e até jacarés. Elas são excelentes nadadoras e frequentemente caçam na água.',
  }
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
      <ScrollView>
        <Pressable onPress={() => carregar(0)} style={styles.buttonCont}>
            <Image style={{
              width: 110,
              height: 100,
            }} 
                    source={{
                      uri: 'https://i.pinimg.com/originals/1b/a5/2c/1ba52caca8089427f122c0068c282a78.png', //Draw Lion   
                    }}/>
        </Pressable>

        <Pressable onPress={() => carregar(1)} style={styles.buttonCont}>
           <Image style={{
             width: 95,
             height: 110,
           }} 
                  source={{
                     uri: 'https://i.pinimg.com/736x/a1/47/a5/a147a533ac281351ceb0b57817153b21.jpg', //Draw Leopardo  
                   }}/>
         </Pressable>

        <Pressable onPress={() => carregar(2)} style={styles.buttonCont}>
          <Image style={{
             width: 110,
             height: 100,
          }} 
                  source={{
                     uri: 'https://ideasnuevas.net/wp-content/uploads/2019/04/MITOposeidon_water_greek_god_abstract_fantasy_hd-wallpaper-1576510-250x156.jpg', //Draw Chita    
                  }}/>
        </Pressable>

        <Pressable onPress={() => carregar(3)} style={styles.buttonCont}>
          <Image style={{
            width: 105,
            height: 120,
          }} 
                  source={{
                    uri: 'https://w7.pngwing.com/pngs/581/763/png-transparent-white-tiger-drawing-tiger-white-mammal-animals.png', //Draw Tiger   
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
                
        <ScrollView>
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
          <View style={styles.imagemContainer}>
          <Image
          source={{ uri: animais[indiceSelecionado].imagem}} 
          style={styles.image}
          />
          </View>
            <Text style={styles.title}>{animais[indiceSelecionado].nome}</Text>
            <Text style={styles.description}>{animais[indiceSelecionado].nomecientifico}</Text>
            <Text style={styles.description}>{animais[indiceSelecionado].habitat}</Text>
            <Text style={styles.description}>{animais[indiceSelecionado].caracteristicas}</Text>
          <Button title="Voltar" onPress={() => voltar()}/> 
          </View>
        </Modal>
        </ScrollView>
      </ScrollView>
    </View>
  );
}
