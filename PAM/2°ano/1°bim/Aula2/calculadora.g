import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, TextInput, Picker} from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Calculadora simples.</Text>
      <StatusBar style="auto" />
      <TextInput
        style={styles.TextInput}
        onChangeText={onChangeNumber}
        value={Number}
        placeholder='useless placeholder'
        keyboardType='numeric'
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },

  TextInput: {
    backgroundColor: '#000',
    color: '#777',
    flex: 1,
    ju
  },
});
