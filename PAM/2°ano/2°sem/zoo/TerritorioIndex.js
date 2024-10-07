import { StatusBar } from 'expo-status-bar';
import { Text, View, Image } from 'react-native';
import { Pressable} from 'react-native-web';
import { useNavigation } from '@react-navigation/native';
import styles from './style.js'

export default function Territorios() {
  const navigation = useNavigation();
  return (
    <View style={styles.container}>
      <View style={styles.territorioArea}>
        <View style={styles.buttonArea}>
            <Pressable style={styles.territorio} onPress={ () => navigation.navigate('Felinos')}>
              <Image style={{width:'100%',height:'100%'}}
              source={{uri:'https://sun9-6.userapi.com/s/v1/ig2/UKJnOv0x_UyjSkVdi0zzb-UhTaydpCVM9ZlanspTnLPWSC-4MJxQ1jmEECAKOHsEJ4Zd1_greQEDFjE4UGQRpAAU.jpg?quality=95&as=32x31,48x47,72x71,108x106,160x157,240x235,360x353,480x470,540x529,640x627,720x705,828x811&from=bu&u=Qw1ThUEzJsOEGFnQ3Q57xBe3bmLkjzRyyzKCaxdcyvw&cs=828x811'}} />
              <Text style={styles.text}>Felídeos</Text>
            </Pressable>
        </View>
        
        <View style={styles.buttonArea}>
            <Pressable style={styles.territorio} onPress={ () => navigation.navigate('Canideos')}>
              <Image style={{width:'100%',height:'100%'}}
              source={{uri:'https://avatars.mds.yandex.net/i?id=26dc301a5abd61a257e1944da92a92df4e2ffd7d5e95189a-12471273-images-thumbs&n=13'}} />
              <Text style={styles.text}>Canídeos</Text>
            </Pressable>
        </View>
      </View>

      <View style={styles.territorioArea}>
        <View style={styles.buttonArea}>
            <Pressable style={styles.territorio} onPress={ () => navigation.navigate('Ursidae')}>
              <Image style={{width:'100%',height:'100%'}}
              source={{uri:'https://i.pinimg.com/originals/0f/12/60/0f126005499108e0dbcb08f30c828858.jpg'}} />
              <Text style={styles.text}>Ursídeos</Text>
            </Pressable>
        </View>
        
        <View style={styles.buttonArea}>
            <Pressable style={styles.territorio} onPress={ () => navigation.navigate('Hienideos')}>
              <Image style={{width:'100%',height:'100%', transform: [{ scaleX: -1 }], }}
              source={{uri:'https://i.pinimg.com/originals/a2/44/a6/a244a681b65b8569a5275d3d049881b0.jpg'}} />
              <Text style={styles.text}>Hienídeos</Text>
            </Pressable>
        </View>
      </View>

      <View style={styles.territorioArea}>
        <View style={styles.buttonArea}>
            <Pressable style={styles.territorio} onPress={ () => navigation.navigate('Baleias')}>
              <Image style={{width:'100%',height:'100%'}}
              source={{uri:'https://s.mediasole.ru/images/588/588085/5.jpg'}} />
              <Text style={styles.text}>Misticetos</Text>
            </Pressable>
        </View>
        
      <View style={styles.territorioArea}>
        <View style={styles.buttonArea}>
            <Pressable style={styles.territorio} onPress={ () => navigation.navigate('AvesdeRapina')}>
              <Image style={{width:'200%',height:'100%', transform: [{ scaleX: -1 }], }}
              source={{uri:'https://sun9-64.userapi.com/s/v1/ig2/DWzY_2D_JQupRZFHLlm899qLzrUvsV7UV8C0nv4pUC7vdbuBeEBwqpO1Ru26IH0E1qbAb1w_8cuAjXJDbxliC-Rq.jpg?quality=96&blur=50,20&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640&from=bu&u=xnxnOdS1ttke71TVmAOUpyoeKUGiOHgsk6OO-z2ko-A&cs=640x640'}} />
              <Text style={styles.text}>Falconídeos</Text>
             </Pressable>
        </View>
      </View>
      </View>
      <StatusBar style="auto" />
    </View>
  );
}
