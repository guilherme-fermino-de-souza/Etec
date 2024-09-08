import { StatusBar } from "expo-status-bar";
import { Text, View, Button } from "react-native-web";
import styles from './style'; // Link estilo
import { useNavigation } from '@react-navigation/native';
// Dá acesso a navegação de objeto

export default function Home() { // Nome da página
    const navigation = useNavigation(); // Const para a navegação
    
    return (
        <View style={styles.container}>
            <Text>Página de home </Text>
            <Button title="Sobre" onPress={ () => navigation.navigate('Sobre')}/>
            <StatusBar style="auto" />
        </View>
    )
}
