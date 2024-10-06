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
            <Pressable style={styles.territorio} onPress={ () => navigation.navigate('Felinos')}>
              <Image style={{width:'100%',height:'100%'}}
              source={{uri:'https://sun9-6.userapi.com/s/v1/ig2/UKJnOv0x_UyjSkVdi0zzb-UhTaydpCVM9ZlanspTnLPWSC-4MJxQ1jmEECAKOHsEJ4Zd1_greQEDFjE4UGQRpAAU.jpg?quality=95&as=32x31,48x47,72x71,108x106,160x157,240x235,360x353,480x470,540x529,640x627,720x705,828x811&from=bu&u=Qw1ThUEzJsOEGFnQ3Q57xBe3bmLkjzRyyzKCaxdcyvw&cs=828x811'}} />
              <Text style={styles.text}>Felinos</Text>
            </Pressable>
        </View>
        
        <View style={styles.buttonArea}>
            <Pressable style={styles.territorio} onPress={ () => navigation.navigate('Felinos')}>
              <Image style={{width:'100%',height:'100%'}}
              source={{uri:'https://avatars.mds.yandex.net/i?id=c6923e551ea263a4eba7a603fca24bce-5663061-images-thumbs&n=13'}} />
              <Text style={styles.text}>Canideos</Text>
            </Pressable>
        </View>
      </View>
      <StatusBar style="auto" />
    </View>
  );
}
