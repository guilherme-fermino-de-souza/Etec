import { StatusBar } from 'expo-status-bar';
import { Text, View } from 'react-native';
import { TextInput, TouchableOpacity } from 'react-native-web';
import { useNavigation } from '@react-navigation/native';
import styles from './style';

export default function Login() {
  const navigation = useNavigation();
  return (
    <View style={styles.container}>
        <Text style={styles.textInput}>Nome</Text>
        <View style={styles.inputArea}>
        <TextInput
        style={styles.input}
        />
        </View>

        <Text style={styles.textInput}>Telefone</Text>
        <View style={styles.inputArea}>
        <TextInput
        style={styles.input}
        />
        </View>

        <Text style={styles.textInput}>E-mail</Text>
        <View style={styles.inputArea}>
        <TextInput
        style={styles.input}
        />
        </View>

      <View style={styles.buttonArea}>

        <TouchableOpacity style={styles.button}
        onPress={ () => navigation.navigate('Territorios')}>
          <Text style={styles.buttontext}>Visitante</Text>
        </TouchableOpacity>

        <TouchableOpacity style={styles.button}> 
          <Text style={styles.buttontext}>Entrar</Text>
        </TouchableOpacity>

      </View>
      <StatusBar style="auto" />
    </View>
  );
}
