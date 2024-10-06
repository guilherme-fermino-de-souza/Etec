import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, Pressable, View } from 'react-native';
import { Modal, ScrollView } from 'react-native-web';
import { Button,Image } from 'react-native-web';
import { useState } from 'react';
import styles from './style.js'

export default function Ursidae() {
// Canideos
  const [animais, setanimais] = useState([
    {
     imagem:'https://png.pngtree.com/thumb_back/fw800/background/20230425/pngtree-big-bear-is-looking-up-at-the-camera-image_2556836.jpg', // Picture Urso-Pardo
     nome:'Urso-Pardo', // Title
     nomecientifico:'Ursus arctos', // Subtitle
     habitat:'Os ursos-pardos são encontrados em uma variedade de habitats, incluindo florestas densas, montanhas e tundras na América do Norte, Europa e Ásia. Eles são conhecidos por se adaptarem a diferentes ambientes, desde florestas temperadas até regiões montanhosas e até mesmo áreas costeiras.',
     caracteristicas:' Os ursos-pardos têm um porte grande, podendo pesar entre 100 a 600 kg. Sua pelagem varia do marrom claro ao escuro e eles possuem uma distintiva corcova nas costas, formada por músculos que ajudam na escavação. Eles têm patas grandes com garras poderosas, que são usadas para cavar, escalar e, claro, capturar presas.',
     reproducao:'As fêmeas dão à luz de 1 a 4 filhotes após uma gestação de cerca de 6 a 8 meses. Os filhotes nascem em tocas e são cegos e vulneráveis. A mãe é extremamente protetora e os filhotes permanecem com ela por cerca de 2 anos, aprendendo habilidades essenciais para a sobrevivência.',
    },
    {
     imagem:'https://avatars.mds.yandex.net/i?id=b6b1df969507f02bff12dbae77151c98bc61b8fb-4275701-images-thumbs&n=13', //Urso-Polar
     nome:'Urso-Polar',
     nomecientifico:'Ursus maritimus',
     habitat:'Os ursos-polares habitam as regiões árticas, principalmente no gelo marinho do Oceano Ártico. Eles são adaptados a ambientes extremamente frios, onde dependem do gelo para caçar focas, sua principal fonte de alimento.',
     caracteristicas:'Com pelagem branca ou amarelada, os ursos-polares são os maiores carnívoros terrestres, podendo pesar até 700 kg. Sua camada de gordura é espessa, ajudando na retenção de calor. Além disso, eles têm patas largas que facilitam a locomoção no gelo.',
     reproducao:'As fêmeas normalmente dão à luz de 1 a 3 filhotes após um período de gestação de cerca de 8 meses. As mães fazem tocas na neve para abrigar os filhotes, que nascem cegos e dependentes. As mães cuidam deles intensamente até que sejam capazes de acompanhar na caça.',
    },
   {
    imagem:'https://yandex-images.clstorage.net/9Jt7k4O14/cf461aKWzG-8/Wh2IiEMXekM3Vq1K3o1KYbjbU7FZA_a5nMuudNjF_OAERjSrs843Z-GigsC6fDZ6Xa73YWXXA5ygBh1DR1krmStpTDxykt93drPtyu7da7Rs6kJ0-UYnHbkLHyE4BQzQIoDT_ITIgOGWULBH2_wz70jKRpTAEkXqATTMZtCcPm4b7xi75JTIc2CnHZt_XGu2ahuA1CgXF2qZe7zmCEKaVoDR46_UmnLyJmBixcj9Ap_IyxN0QjBnSuckf2VRn_-MmX06q4eWK0EDVF0bLK97JamokuV6hqU6eFl9R4uyCTYDgeGu5UoQ07ZjgIVIrnBcezvz1bIyBujVdN1EsRztjPhNadvGlboQk9duaM5vCZe6KeIUqqZEqYm4TSUZQJkH8WNjnIQ78yIGgLOECq2j7ipLANTSgQWI52RtFRD8_K4I3pjZpFXZYQNlnPsMv4nV-ykSZonGZ2uLmX9mKXG69HDhoYx1-4Ny19CyN6sfMCyYeGJkkMB0KmYlv2ciLg6PSD0Im1eFexBBlJ4K_I_7J4rZ4OcKtBaqejiNVehDuLVA42LsxCujI8QAIVapfkNf6MsCNOGihnt3Vb9UI51fXUl9OUunBusio6Rv6x6MK8QLm3FXiAdEqTha3hRZgjmEM4GiTvQZAqI04PJ3yE9Bf0gb80fg8jVKx4ZdRCJ-_Y8bLDiJJUc7QmHVXvq8fAinywvANxm01ljJm780W2B7dgGTcIwl-ABg97GQJ7rPo8wYCLBHklIGuOZUjiThvW1fKR85iNTGqSMA1B2YfZ-rFDh4Y1aYhXc7ift9VQmieLXw8AGs9DuRkfXA0DdKTVH8e4nxdcFBlxqVJN1VUw4_nCrMGVnFRIjiQWR-Cg5N6OWoa3KXaWUWC2npDVb6YlnVwnHBXdZrgqDH0JD3aR4zzCp5AieSQwTIp_asVDCvXbw63NsJ97aI0OPF_9qsb1qliWnwBsnnpmsYiT0nk', //Panda-Gigante
    nome:'Panda-Gigante',
    nomecientifico:'Ailuropoda melanoleuca',
    habitat:'O panda-gigante vive principalmente em florestas de bambu nas montanhas da China, onde a vegetação densa fornece abrigo e alimento. Eles são adaptados para viver em altitudes elevadas, onde o clima é mais fresco.',
    caracteristicas:'Com pelagem preta e branca, os pandas têm uma aparência inconfundível. Eles possuem um corpo robusto e fortes mandíbulas que os ajudam a consumir grandes quantidades de bambu, que compõe mais de 99% de sua dieta. Os pandas são também conhecidos por seu comportamento brincalhão e curioso.',
    reproducao:' A fêmea geralmente dá à luz de 1 a 2 filhotes após uma gestação de cerca de 95 a 160 dias. Os filhotes nascem cegos e dependentes, e a mãe os amamenta e cuida deles até que estejam prontos para explorar e aprender a se alimentar de bambu.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/i?id=234303ed91c67317a89bc2b2bce4b876373f9298-10595607-images-thumbs&n=13', //Urso-Negro-Americano
    nome:'Urso-Negro-Americano',
    nomecientifico:'Ursus americanus',
    habitat:'Este urso é encontrado em florestas, montanhas e até em áreas urbanas da América do Norte. Eles são adaptáveis e podem viver em uma variedade de habitats, desde florestas temperadas até regiões montanhosas.',
    caracteristicas:'Os ursos-negros têm pelagem negra, mas algumas subespécies podem ter colorações canela ou até branca. Eles possuem um corpo esguio e são excelentes escaladores, podendo subir em árvores para se proteger de predadores ou buscar alimento. Sua dieta é onívora, consistindo de frutas, nozes, insetos e pequenos mamíferos.',
    reproducao:' As fêmeas dão à luz geralmente de 1 a 3 filhotes após um período de gestação de cerca de 7 meses. Os filhotes nascem em tocas e são dependentes da mãe durante os primeiros meses. Ela os ensina a encontrar alimento e explorar o ambiente. Os filhotes permanecem com a mãe por cerca de 1 a 2 anos.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/get-mpic/1750207/img_id6118178064792646879.jpeg/orig', //Urso-Cinzento
    nome:'Urso-Cinzento',
    nomecientifico:'Ursus arctos horribilis',
    habitat:'O urso-cinzento, também conhecido como urso-grizzly, habita principalmente as montanhas e florestas do oeste da América do Norte, incluindo áreas do Alasca e do Canadá. Eles são adaptados a climas frios e frequentemente se movem em altitudes mais elevadas.',
    caracteristicas:' O urso-cinzento é reconhecido por seu pelo marrom claro a escuro e pela distintiva corcova nas costas. Eles são robustos, com um peso que pode ultrapassar 600 kg. Sua dieta é variada, incluindo peixes, frutos silvestres, raízes e até carniça. São conhecidos por sua força e habilidade de nadar.',
    reproducao:'As fêmeas têm um período de gestação de cerca de 6 meses e geralmente dão à luz de 1 a 4 filhotes. Os filhotes nascem em tocas e são cuidados pela mãe até que sejam capazes de buscar alimento sozinhos. A mãe é muito protetora, e os filhotes permanecem com ela por até 3 anos, aprendendo as habilidades necessárias para sobreviver na natureza.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/i?id=2c3acc2b38392ac1ef7d3a095975f86568d2f95af21cd935-3492565-images-thumbs&n=13', //Urso-Sendo
    nome:'Urso-Sendo',
    nomecientifico:'Ursus thibetanus',
    habitat:'O urso-sendo, ou urso-de-patas-pretas, é encontrado em florestas de montanha e áreas de vegetação densa na Ásia, especialmente no Himalaia e na China. Eles preferem habitats que oferecem cobertura e acesso a água.',
    caracteristicas:'Este urso é menor em comparação com outras espécies, pesando entre 50 a 200 kg. Eles têm pelagem preta com uma distintiva marca branca em forma de V no peito. Seus dedos são longos e adaptados para escalar árvores, onde muitas vezes encontram abrigo e alimento.',
    reproducao:'As fêmeas dão à luz de 1 a 3 filhotes após uma gestação de cerca de 6 a 7 meses. Os filhotes nascem cegos e vulneráveis, e a mãe é responsável por sua proteção e ensino. Os filhotes permanecem com a mãe por cerca de 1 a 2 anos, durante os quais aprendem a buscar alimento e explorar seu habitat.',
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
              source={{uri: 'https://avatars.mds.yandex.net/i?id=c9df0f057e00d6d656b1c2c27ed60ab9f4abe557-8565700-images-thumbs&n=13', }}/>
              <Text style={styles.text}>Urso-Pardo</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(1)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Urso-Polar
              source={{uri: 'https://avatars.mds.yandex.net/i?id=8b5179a03118e98006d404fce310aad029b61733-8497167-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Urso-Polar</Text>
              </Pressable>
          </View>
      </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(2)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Urso-Panda
              source={{uri: 'https://live.staticflickr.com/606/21241530781_34d47acb92_b.jpg',}}/>
              <Text style={styles.text}>Urso-Panda</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(3)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Urso-Negro-Americano
              source={{uri: 'https://yandex-images.clstorage.net/9Jt7k4O14/cf461aKWzG-8/Wh2IiEMXekM3Vq1K3o1KYbjbU7FZA_a5nM6bMc2gnFUENrHLs6sSQtFCgsAPeTY_XQvXcbWy04yFUuhjR2kL2V4JSTmn59pTN2Z9224dOtE4K9PwGXPTPOroPDaawys2M-FTfHd7YvL0k0Y1Cpzw_PyZMzRCQtarpYS8NPFfHK0oTbloNmbaUTGXv3u_TAqmGFtwNyk0RbpIuQxlypHZJYPRgf5kelOCdJIT1Yi-0lwaiYA3w0EXSScWniSSXf-fS7756GWVysLyJK1K7d249vl5sZaqxNbay-kOZPtBuwQT0mO-5CkhQcdi83R4vLP-KNkiFiPCBUlGJs1U015uzts9ypuHVbhw4aXduz39WWUImIH0ODZG6zkLjFaaMFj1ozFQv6Yq8vOWEgB1GA-wnhrJkkeCIhRrtrU8VrGeDb9LjzgIRYU4MqClLckenXqnCrmztwgHZRi4iU5Ga_AopXJhUQwHmGExJCFixVpOwTybiEA1sPDmSvZWrBRCTq_OCX46-bW1SsDRVd9Ine8LZvsYQYTJNWdZiIuNJtogCPRhscJtBfkSQlSSApUrLDNtivhABrFDt5j3Fp3Ess0__OtOyxhXtpojUBdO-B9cWWW5ehLFePTmaPvpTYTqEql1kVERTGTIEGL0QvPmKnyAXDorohawoBVKpUecBjCM75wpP_oJ9Ua5QJCH_5iO78uUSLtz5XoWpJrJ-59GO_Ort1IAcxwWSPLRpFGw5ljcs64b-XF2c2OFmpd0nQfBDX39SD65azSlGvNj9Fz5D95q9wjbsYQo1KdZOJjuZuowOkZQcTMM5soA4cfQ8dQLzyIMaIkiB8HQ11mUp73W0I9cPAmO2vlHd1kC8-dNOP4-C8foycGH2xSGOQoZLpfIYCl3YmFzzMWZYtGWIAKGWM2x3lpbUwaicbV5hLd_huJ9XA6rL1sp5VXrQtLlz6levLunmanx9rk1Nyl6Kx22s',}}/>
              <Text style={styles.text}>Urso-Negro</Text>
            </Pressable>
          </View>
        </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(4)}>
              <Image style={{width: '100%',height: '100%',}} //Urso-Cinzento
              source={{uri: 'https://avatars.mds.yandex.net/i?id=778b035913596405c90989a057f1ccae81baba05-10754985-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Urso-Cinzento</Text>
            </Pressable>
          </View>
   
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(5)}>
              <Image style={{width: '100%',height: '100%',}} //Urso-Sendo 
              source={{uri: 'https://avatars.mds.yandex.net/i?id=53ff39153aa884eff7cc5d8bdff87da1-5501633-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Urso-Sendo</Text>
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
