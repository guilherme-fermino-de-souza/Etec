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
     reproducao:'Os leões (Panthera leo) têm um sistema social único, vivendo em grupos chamados de alcateias, que geralmente são compostas por várias fêmeas, seus filhotes e um ou mais machos. A reprodução ocorre durante todo o ano, mas a maioria dos nascimentos acontece na estação das chuvas. As fêmeas costumam entrar em estro e se acasalar com o macho dominante da alcateia. Após um período de gestação de cerca de 110 dias, a fêmea dá à luz de 1 a 4 filhotes, que nascem cegos e dependem da mãe para sobrevivência. Os filhotes são amamentados por aproximadamente 6 meses, e a mãe se torna uma cuidadora protetora, ensinando-os a caçar e se integrar à vida da alcateia.',
    },
    {
     imagem:'https://yandex-images.clstorage.net/owa560k82/9ba423QTV3/M4drYNeYiPilA9Gj8TEdOW65DtiORJVPan7wq5cX23MrYtslqQTIx4qVOWa5rYEVZkSdZL2vDm2gucvs9VYjLyTSfiyU2JSs8kPH6r02FD1x8hOQjgOJHWFp6_vCA9l-JWWJTsJ867Dlu1wfzoCuVDcTzzTzsVxn-4ejrfsZe3kHsk5M4oX2_pUbtazhFRI-Yf4z1r8nughgU5nM6ReIfEIG0UL5XsyK471DHd-cpUggGNkj_91bctyqieb-AHtOMKhrQOuy4O-vH4-N1zURLGXGF8WiOo0ycGyh9sQGq2JuFv5a-nLdl_akeSfhm6JCPhXSPOfSTU3erLLixSxffQmDeFTEkd7vohOUrtQQNBBv7gjWvwCQEmpjn_L8I7VzcCXwd9d-_Jz5pUszxq2jYRMa-iPbxlVu26Kb6sA7SlIDknFW1YjIxao3rKnzHi4Ifu00-rgFrSFMSqrC-RSMXnA_wGDwbNCF4pV4Dsu5ukU0KMUSw-dFWP23sdT6Gmx4J4FUcPeS4OyDE42W2BcyEFHxNf6gDLAHcVih8f4UlVJzGcJ15XLJn9eeVz7ZhIhVMifSB8DofHDRtKru-jRxRDyLa1bEktzsgBKziNEbHylRxjXzrAmdPUt0r9jZIKV5fDzTVMtx8oXykF4T_KuBeCA8-wbz1kxyzqmY_PYAYlEEp3l49IXQzIsqiKPWPQ4wVNEyzK0aqD1PeZvA2T-MQkoG8Ef4bNiI3qViMduOmngDBeEEyPNsQP6xhd_jKFlgIYNqV_WIwtKkBYqxxisLPlHCBvWeDJoDdl-H6fcfrV9gE-pE0lvms8mGZADcvYlHFA_DEsToUUP6lpXK6i9gZxK8aEXQk-ryrSG7lckrMDF73xT6vBmxAllyl-nfG7N6dQL1Sel-87zSo2kv7KGsVB8R4Sbq1lFt4J6xxN0BdVwBsHtC95z3z68qsovKMigWV_UYza8IqzJPU5zt2iU', // Leopardo
     nome:'Leopardo',
     nomecientifico:'Panthera pardus',
     habitat:'Os leopardos preferem florestas densas, savanas, montanhas e áreas rochosas. Sua habilidade de se adaptar a diferentes tipos de habitat é uma das razões pelas quais eles são tão bem-sucedidos. Eles também são conhecidos por serem excelentes escaladores, frequentemente se escondendo em árvores para descansar e armazenar suas presas, evitando assim concorrência com outros predadores, como leões.',
     caracteristicas:'Leopardos são solitários e territoriais, geralmente marcando seu território com arranhões em árvores e urina. Eles são mais ativos à noite (noturnos), o que os ajuda a evitar concorrência com outros predadores.',
     reproducao:'Os leopardos (Panthera pardus) também são animais solitários, exceto durante a época de reprodução. As fêmeas se tornam receptivas a cada 6 a 7 meses, e o acasalamento pode ocorrer durante todo o ano. Após uma gestação de aproximadamente 90 a 105 dias, a fêmea dá à luz de 1 a 4 filhotes, que nascem cegos e vulneráveis. Os filhotes são mantidos em um abrigo seguro, geralmente em uma toca ou em um local elevado, como uma árvore. A mãe os amamenta e os protege até que eles possam se aventurar e começar a caçar com ela, geralmente por volta dos 3 meses. Após cerca de 18 meses, os jovens leopardos se tornam independentes e deixam a mãe para estabelecer seus próprios territórios.',
    },
   {
    imagem:'https://avatars.mds.yandex.net/i?id=c7894a7cc044ca7f8d98242c36e46e1090b33c9ac8b667ee-10196407-images-thumbs&n=13',
    nome:'Chita',
    nomecientifico:'Acinonyx jubatus',
    habitat:'As chitas preferem habitats abertos, como savanas, pastagens e áreas semiáridas, onde podem usar sua incrível velocidade para caçar. A vegetação esparsa nesses ambientes facilita a emboscada e a perseguição de presas.',
    caracteristicas:'As chitas são mais sociais do que outros felinos, formando grupos chamados de “coalizões”, que são frequentemente compostos por machos irmãos. Elas são diurnas, caçando durante o dia, e dependem de sua velocidade em vez de força para capturar presas, que incluem gazelas e outros ungulados pequenos.',
    reproducao:'As chitas (Acinonyx jubatus) têm uma abordagem de reprodução que é ligeiramente diferente dos outros grandes felinos. Elas podem acasalar em qualquer época do ano, mas muitas vezes se reproduzem na estação das chuvas, quando há maior disponibilidade de presas. Após um período de gestação de cerca de 90 a 95 dias, a fêmea dá à luz de 3 a 5 filhotes, que nascem cobertos por uma pelagem densa que os camufla. A mãe cuida dos filhotes, que começam a sair da toca e explorar o ambiente após algumas semanas. Ela é extremamente cuidadosa, movendo os filhotes para novos locais para protegê-los de predadores. Os filhotes permanecem com a mãe por cerca de 18 meses, aprendendo habilidades de caça e sobrevivência.',
  },
  {
    imagem:'https://i.pinimg.com/originals/5e/a0/eb/5ea0eb69c6a3b65dafbfefa7e81971b5.jpg',
    nome:'Tigre',
    nomecientifico:'Panthera tigris',
    habitat:'Os tigres preferem habitats densos, como florestas de mangue, florestas tropicais e áreas de vegetação densa, que oferecem cobertura para caça e proteção. Também podem ser encontrados em áreas mais abertas, desde que haja água disponível.',
    caracteristicas:'Os tigres, conhecidos cientificamente como Panthera tigris, são os maiores felinos do mundo, conhecidos por sua força e beleza. Eles habitam principalmente florestas tropicais, savanas e áreas montanhosas na Ásia, com as populações mais significativas na Índia, onde o tigre de Bengala é o mais famoso.',
    reproducao:'Os tigres (Panthera tigris) são solitários, exceto durante a época de acasalamento e a criação dos filhotes. As fêmeas entram em estro várias vezes ao longo do ano, e o acasalamento pode ocorrer durante qualquer estação. Após um período de gestação de cerca de 93 a 112 dias, a fêmea dá à luz de 2 a 4 filhotes, que são totalmente dependentes dela nas primeiras semanas. Os filhotes começam a sair da toca e explorar seu ambiente por volta dos 2 meses de idade. A mãe é extremamente protetora, caçando para sustentar os filhotes até que eles tenham cerca de 6 meses e possam acompanhar a mãe nas caçadas. Os jovens tigres permanecem com a mãe até os 2 anos, aprendendo habilidades essenciais de sobrevivência.',
  },
  {
    imagem:'https://i.pinimg.com/originals/74/45/4e/74454ece855e7eb72cabfbc7ad623c61.jpg',
    nome:'Lince-ibérico',
    nomecientifico:'Lynx pardinus',
    habitat:'O lince-ibérico habita principalmente áreas de matas, florestas e regiões de vegetação densa, como arbustos e matagais. Prefere habitats com boa cobertura para caçar e se esconder, e também depende da presença de água próxima.',
    caracteristicas:'Os linces-ibéricos são solitários e territoriais. Eles se alimentam principalmente de coelhos, que são sua principal fonte de alimento, mas também podem caçar aves e pequenos mamíferos. A espécie está em recuperação devido a esforços de conservação, mas ainda enfrenta ameaças como a perda de habitat e a redução das populações de presas.',
    reproducao:'O lince ibérico (Lynx pardinus) é uma espécie ameaçada que se reproduz na primavera, geralmente entre fevereiro e abril. As fêmeas atraem machos com vocalizações e sinais olfativos. Após um período de gestação de cerca de 60 a 70 dias, a fêmea dá à luz de 1 a 4 filhotes em um abrigo escondido, como uma toca ou uma densa vegetação. Os filhotes nascem cegos e dependem totalmente da mãe. Após aproximadamente 4 meses, começam a explorar o ambiente e, aos 6 meses, já são capazes de caçar pequenos animais. A mãe cuida dos filhotes até que tenham cerca de um ano, quando se tornam independentes e começam a estabelecer seus próprios territórios.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/i?id=b919f085ae1bedea4dd40e09c9c3283650dd91f0-9181181-images-thumbs&n=13',
    nome:'Onça-pintada',
    nomecientifico:'Panthera onca',
    habitat:'A onça-pintada é encontrada em uma variedade de habitats, incluindo florestas tropicais, savanas, pantanais e áreas de vegetação densa. Ela é mais comum nas florestas da Amazônia, mas também pode ser vista em regiões como o Pantanal e áreas do México até o sul dos Estados Unidos.',
    caracteristicas:'As onças são solitárias e territoriais, caçando principalmente à noite (são noturnas). Sua dieta é variada e inclui presas como capivaras, pecarís e até jacarés. Elas são excelentes nadadoras e frequentemente caçam na água.',
    reproducao:'A onça pintada (Panthera onca) é um grande felino que se reproduz durante todo o ano, embora a maioria das cópulas ocorra durante a estação das chuvas. As fêmeas entram em estro e atraem machos através de vocalizações e marcas de cheiro. Após um período de gestação de aproximadamente 93 a 105 dias, a fêmea dá à luz de 1 a 4 filhotes em um abrigo seguro, como uma caverna ou um denso matagal. Os filhotes nascem cegos e dependentes da mãe. A mãe é uma cuidadora atenta, amamentando os filhotes até cerca de 3 meses, quando começam a comer carne. Os filhotes aprendem a caçar com a mãe e permanecem sob sua proteção até cerca de 2 anos, quando se tornam independentes.',
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
              <Image style={{width: '100%',height: '100%',}} //Draw Lion
              source={{uri: 'https://avatars.mds.yandex.net/i?id=0261d65e7695f527c78e88a6b6913300c2460607-5272510-images-thumbs&n=13', }}/>
              <Text style={styles.text}>Leão</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(1)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Leopardo
              source={{uri: 'https://s1.1zoom.ru/big0/219/Big_cats_Leopards_Black_background_534034_1024x1024.jpg',}}/>
              <Text style={styles.text}>Leopardo</Text>
              </Pressable>
          </View>
      </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(2)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Chita 
              source={{uri: 'https://avatars.mds.yandex.net/i?id=227c2712fd04e5923e6234177b402177-5485758-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Chita</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(3)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Tiger
              source={{uri: 'https://avatars.mds.yandex.net/i?id=b66e66e305f83fab84d3c508ae3513221434aa7d-5115981-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Tigre</Text>
            </Pressable>
          </View>
        </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(4)}>
              <Image style={{width: '100%',height: '100%',}} //Lince-Ibérico 
              source={{uri: 'https://cdn.discordapp.com/avatars/206192752638164993/a57f58cd4371cc21c934409476523cff.png?size=2048',}}/>
              <Text style={styles.text}>Lince-Ibérico</Text>
            </Pressable>
          </View>
   
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(5)}>
              <Image style={{width: '100%',height: '100%',}} //Onça-Pintada 
              source={{uri: 'https://avatars.mds.yandex.net/i?id=ff315c824080d960f570d9db6a3f7fba8b11a32b-5256374-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Onça-Pintada</Text>
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
