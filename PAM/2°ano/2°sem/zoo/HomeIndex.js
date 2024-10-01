import { StatusBar } from 'expo-status-bar';
import { Text, TouchableOpacity, View } from 'react-native';
import { Button } from 'react-native-web';
import { useNavigation } from '@react-navigation/native';
import styles from './style';

export default function Home() { // Tela Principal
  const navigation = useNavigation();

  return (
    <View style={(styles.container)} >
      <View style={(styles.home)} >
        <StatusBar style="auto" />
        <Text style={styles.texto}>Zoológico</Text>
          <TouchableOpacity style={styles.button}
            title="Fazer login"
            onPress={ () => navigation.navigate('Login')}>
            <Text style={styles.buttontext}>Entrar</Text>
            </TouchableOpacity>
        </View>
    </View>
  );
}
