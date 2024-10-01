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
              <Image style={{width:'100%',height:'90%'}}
              source={{uri:'https://w7.pngwing.com/pngs/581/763/png-transparent-white-tiger-drawing-tiger-white-mammal-animals.png'}} />
              <Text>Felinos</Text>
            </Pressable>
        </View>
      </View>
      <StatusBar style="auto" />
    </View>
  );
}
