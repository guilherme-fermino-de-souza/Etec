import { StatusBar } from 'expo-status-bar';
import { Text, View } from 'react-native';
import { Button } from 'react-native-web';
import { useNavigation } from '@react-navigation/native';
import styles from './style';

export default function Home() {
  const navigation = useNavigation();

  return (
    <View style={(styles.container)} >
      <StatusBar style="auto" />
        <Text style={styles.texto}>Bem Vindo Ao Zoológico</Text>
        <Button
        title="Fazer login"
        onPress={ () => navigation.navigate('Login')}/>
    </View>
  );
}
