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
            <Button title="Ter1" onPress={ () => navigation.navigate('Ter2')}/>
            <Button title="Ter2" onPress={ () => navigation.navigate('Ter2')}/>
            <Button title="Ter3" onPress={ () => navigation.navigate('Ter3')}/>
            <Button title="Ter4" onPress={ () => navigation.navigate('Ter4')}/>
            <Button title="Ter5" onPress={ () => navigation.navigate('Ter5')}/>
            <Button title="Ter6" onPress={ () => navigation.navigate('Ter6')}/>
            <StatusBar style="auto" />
        </View>
    )
}
