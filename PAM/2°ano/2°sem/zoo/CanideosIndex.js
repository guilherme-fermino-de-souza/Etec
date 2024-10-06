import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, Pressable, View } from 'react-native';
import { Modal, ScrollView } from 'react-native-web';
import { Button,Image } from 'react-native-web';
import { useState } from 'react';
import styles from './style.js'

export default function Canideos() {
// Canideos
  const [animais, setanimais] = useState([
    {
     imagem:'https://avatars.mds.yandex.net/i?id=cf72646866ecc3df76698cd3bc4372a632513d09-8251154-images-thumbs&n=13', // Picture Lobo
     nome:'Lobo', // Title
     nomecientifico:'Canis lupus', // Subtitle
     habitat:'Os lobos habitam uma variedade de ambientes, incluindo florestas, tundras, montanhas e até desertos. Eles são encontrados principalmente em regiões da América do Norte, Europa e Ásia, onde possuem vastos territórios que podem cobrir dezenas de milhares de quilômetros quadrados.',
     caracteristicas:'Os lobos são animais sociais e vivem em grupos chamados alcateias. Eles têm um corpo musculoso, patas longas e um focinho alongado, com pelagem que varia em cores de branco a negro, passando por cinzas e marrons. São conhecidos por sua inteligência, habilidades de comunicação e estratégias de caça em grupo.',
     reproducao:'A reprodução dos lobos ocorre geralmente uma vez por ano, na primavera. As fêmeas entram em estro e atraem machos para acasalamento. Após um período de gestação de cerca de 63 dias, a fêmea dá à luz de 4 a 7 filhotes, que nascem cegos e dependentes da mãe. Os filhotes são amamentados e cuidados pela alcateia, aprendendo a caçar à medida que crescem.',
    },
    {
     imagem:'https://yandex-images.clstorage.net/9Jt7k4O14/cf461aKWzG-8/Wh2IiEMXekM3Vq1K3o1KYbjbU7FZA_a5nM7ONJjAvKVRQ3G-pstHYoFXp4APCSNvWN7nMaCy82zAMxgTZwkbvB4pTLxyYj9XVqIJiq4dC5UJD9O1KMbWCO173vWNUDwQBEDSHIT5UeBH4FCnqI2zH-jbk_AQ0mbKBsI_1yKO3pz5DSsoZWTJYHLULXr_jIqVCwkid4gXhziaW65WSmB7hoLigyzXqQMSVFBgdSqesi6YW5Kl8FBE6KYkL2QhD91dG4-5CnUHy4NAt946f995hZjKkWW5RRaKyrqMl-vjixXiYdMu1pjTcHXAY5dqHuFcW-hiRVGgRokEFn_GAO9eTxvuiVkFRsgSESddCQw9ufcq2RAVSJU2a1lLbaeJcXmF05MxrOT5opOEcICka1zij-m5ErZQwPWKZCRvdlFOvl45HhqoByQIcWC37_uf_2l3aJgQ5Tq2VkibSUyVykFIpiASs270CGLj1KHQpdj9UBwrCyHU4IK0-8alLqQjfGysGF75OEXX2NMR9R75bg9ZBZrp4Be7NSQ5WrjtZ_mAeqRhIrGtlLmyw4WyADa5_zFvWHuStLDz1gmXtF6kEH3f_cpfuQmVJ1tDIxcuCI_tWtV5aKKGC7eXa1n6jzS4MbslUFHTbTaJgGIEQuDlmJ4AbXjbQkXD8oa6pgSNRgB8PF8YDegIV6Uak0PVXzmeT6r2GqgyN2smJPmoC05VmDNZZ6Jjwb_0WGFgxoGxh8jsgI_Li1EGw4AmiVQlX5Vgv__PyD_bCVZUmwEitF56_I5JValbQZQKpxVYy0sul_lhm2RhkqLO1Imi8TeDwMfYHAJ9--jQR_HTNRj2Vi_GEQ1MnQs8CCmHRRkg4_XuGW79mxZYy1KFy1b1OfurPOf6kltFAaAjDiWr8uIGsdCHGD9RH8u5ILSjgDeLJGT9txBu7f8rLBjr13frINFXT5i-X7mkGOpQB1r2d4mb2lzXg', // Coiote
     nome:'Coiote',
     nomecientifico:'Canis latrans',
     habitat:'Os coiotes são extremamente adaptáveis e podem ser encontrados em uma variedade de habitats, incluindo desertos, florestas, montanhas e áreas urbanas. Eles estão presentes na América do Norte e partes da América Central.',
     caracteristicas:'Os coiotes são menores que os lobos, com um corpo esguio e patas longas. Sua pelagem é geralmente cinza ou marrom com manchas mais claras. Conhecidos por sua habilidade de vocalização, os coiotes emitem uma série de sons, incluindo uivos e gritos.',
     reproducao:'A época de reprodução dos coiotes ocorre entre janeiro e março. Após um período de gestação de cerca de 63 dias, a fêmea dá à luz de 4 a 7 filhotes. Os filhotes nascem em tocas ou buracos e são alimentados pela mãe até que possam começar a caçar com ela, normalmente por volta dos 2 meses de idade.',
    },
   {
    imagem:'https://s1.1zoom.me/b5050/944/376741-sepik_1920x1200.jpg', //Raposa
    nome:'Raposa',
    nomecientifico:'Vulpes vulpes',
    habitat:'As raposas-vermelhas são encontradas em uma ampla gama de habitats, incluindo florestas, campos, montanhas e áreas urbanas. Elas são distribuídas por toda a Europa, Ásia e América do Norte.',
    caracteristicas:'As raposas têm um corpo esguio, focinho afilado e uma cauda longa e espessa. Sua pelagem é predominantemente vermelha, com patas e peito brancos. Elas são noturnas e possuem uma visão aguçada, tornando-as eficientes caçadoras.',
    reproducao:'A época de reprodução ocorre entre janeiro e março. Após um período de gestação de aproximadamente 52 dias, a fêmea dá à luz de 4 a 6 filhotes, que nascem em um buraco ou toca. A mãe cuida dos filhotes, que começam a sair da toca após algumas semanas.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/i?id=52086874494ad8eec897b9df0b41107b44007b5c-5189719-images-thumbs&n=13', //Lobo-guará
    nome:'Lobo-guará',
    nomecientifico:'Chrysocyon brachyurus',
    habitat:'O lobo-guará habita principalmente os cerrados e savanas da América do Sul, especialmente no Brasil, Paraguai e Argentina. Eles preferem áreas abertas com vegetação esparsa, onde podem caçar com facilidade.',
    caracteristicas:'O lobo-guará é o maior canídeo da América do Sul, com pernas longas e corpo esguio. Sua pelagem é de cor avermelhada com manchas pretas, e eles têm o focinho longo e fino. São conhecidos por seu caráter solitário e hábitos noturnos.',
    reproducao:'A reprodução ocorre geralmente entre maio e agosto. Após um período de gestação de cerca de 60 a 65 dias, a fêmea dá à luz de 2 a 6 filhotes. Os filhotes são cuidados pela mãe até que possam se alimentar sozinhos, e a mãe frequentemente os leva para caçar.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/i?id=b771b1c24f5df9cf5fef4f20ff0c25ed751f947f-9065891-images-thumbs&n=13', //Cachorro-doméstico
    nome:'Cachorro-doméstico',
    nomecientifico:'Canis lupus familiaris',
    habitat:'Os cães domésticos vivem em estreita associação com os humanos e são encontrados em quase todos os ambientes habitáveis, desde áreas urbanas a rurais. Eles são uma das espécies mais diversas em termos de habitat.',
    caracteristicas:'Os cães variam enormemente em tamanho, forma e cor, dependendo da raça. Eles têm um olfato aguçado e habilidades sociais bem desenvolvidas, tornando-os animais de companhia populares e excelentes para trabalho em equipe.',
    reproducao:'Os cães se reproduzem ao longo do ano, mas a maioria das fêmeas entra em estro duas vezes por ano. Após um período de gestação de cerca de 63 dias, a fêmea dá à luz de 1 a 12 filhotes, dependendo da raça. Os filhotes são amamentados pela mãe e dependem dela nos primeiros meses.',
  },
  {
    imagem:'https://avatars.mds.yandex.net/i?id=b47515c559ad6d8f4c2b264af6ccf5807343e785-12932370-images-thumbs&n=13', //Cão-selvagem-africano
    nome:'Cão-selvagem-africano',
    nomecientifico:'Lycaon pictus',
    habitat:'O cão-selvagem-africano habita principalmente savanas e áreas de vegetação aberta na África subsaariana. Eles são adaptáveis e podem viver em diversas condições, mas preferem regiões com alta densidade de presas.',
    caracteristicas:'Esses canídeos são conhecidos por seu pelagem única, que apresenta padrões irregulares de amarelo, preto e branco. Eles têm orelhas grandes e arredondadas e são muito sociáveis, vivendo em grupos coesos.',
    reproducao:'A reprodução ocorre durante todo o ano, com a maioria dos nascimentos acontecendo durante a estação das chuvas. Após uma gestação de cerca de 70 dias, a fêmea dá à luz de 2 a 20 filhotes, dependendo da disponibilidade de alimentos. Os filhotes são cuidados pela alcateia, que caça e traz alimentos para a mãe e os jovens.',
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
              <Image style={{width: '100%',height: '100%',}} //Draw Lobo
              source={{uri: 'https://yandex-images.clstorage.net/9Jt7k4O14/cf461abjfT_d/fvltWWaXu0ISlgm67owvBMgr4rX4EubJiF8-VNmkCPWRI2G_98oixkHX15BPWQZKXGvzVAHjlkm2xswG8kzuPFueaZlSt48HliI9PwuoHvBIa1dgnJMDqckr2xTYwPmQJEY1HmfL4mFHMNDHGZ7QLZrpUJVg8nZZpLLdFpLvjShJrNkb17cYUrE2L8ldr2qGSBvDtDjmVRv5me-lCfGahXEB4240qOGDFgCDl0tsw52qO9KGYcMG2aXnPZSwzS3OWR_amtR2-tAjFD-qX0xY5btbQ-fL9sbYSove95hDymRTwELtxDuBAEYCgqabDuINqdmSBjKxxWpVB5xksqyP_Am9-3pXZPqxE0dP61zdCXU4aDAFC4R0y8v7Lye4olmVsvAgfzarsPKkgLDH6u0TvUrqk0QxYnc7JfSdBAGv784ZDarbt3XYQYC2TYmcvnjlipqjx9sENorLC10E2IGbl5PCY08HiENzJkKgNiqdQ2wa6yDlg_G1iRaWLUZA3k1PWN_Y6WWH-QFjJg96TBwJp3uYUjfrdsT7O_nch6rwWmYyMFCONYoCQySBwIf6vRJ_ynhB5-KCxvml9n03IiwcXijf6-jW1isAIxffis-MO0VLabPV6KYnenlobAUZolkkUGMRP_QLMzBGQWK3yByTjyqrYIbTgOZZdQcONnKfLe77PfvpNXT5UnIWHQiOXFuHOliidxiFRLrp2QyUqjCo1ZECMT0WScECVJOgZikeUUx7yTD0U2JVCWZEDkTSrN_PKe6bKvbkKWBBFxz5D8465jsbwLb7JvdJmnptFZuRy5XxwFBv1EoC8zfigLfqj6BOCokgBNGQZWrnBTwXwT19vFm96phFtupjkjfN6I3v-6eLeFLFKWUG2YlrrOR78Pt147BTnBRrYsG2InGVupyRfBrJ4CeC8lU7F_ZuRMOur46LzOv75NTKc4L1ndp_78kFKvmCZwvXRviL6T1E8', }}/>
              <Text style={styles.text}>Lobo</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(1)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Coiote
              source={{uri: 'https://avatars.mds.yandex.net/i?id=f50b811c48c187649d6f68f219c9d2b3dcbe748f-4827339-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Coiote</Text>
              </Pressable>
          </View>
      </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(2)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Raposa
              source={{uri: 'https://avatars.mds.yandex.net/get-shedevrum/12151221/cropped_original_3295ecbedec011eeb8ba9a893316e300/orig',}}/>
              <Text style={styles.text}>Raposa</Text>
            </Pressable>
          </View>

          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(3)}>
              <Image style={{width: '100%',height: '100%',}} //Draw Lobo-Guará
              source={{uri: 'https://avatars.mds.yandex.net/i?id=6872ffd1c8beafe418730a3710b681747ecf8c98-12753090-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Lobo-Guará</Text>
            </Pressable>
          </View>
        </View>

        <View style={styles.felinosArea}>
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(4)}>
              <Image style={{width: '100%',height: '100%',}} //Cachorro-Doméstico 
              source={{uri: 'https://avatars.mds.yandex.net/i?id=c2b234b7e76a9f1fe7f7015de5626d38-5487639-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Cachorro-Doméstico</Text>
            </Pressable>
          </View>
   
          <View style={styles.buttonArea}>
            <Pressable style={styles.felinos} onPress={() => carregar(5)}>
              <Image style={{width: '100%',height: '100%',}} //Cão-selvagem-africano 
              source={{uri: 'https://avatars.mds.yandex.net/i?id=affb379425663dcaea1c378fffbaa7d097954d42-4276653-images-thumbs&n=13',}}/>
              <Text style={styles.text}>Cão-selvagem-africano</Text>
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
