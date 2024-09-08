import { StatusBar } from "expo-status-bar";
import styles from './style'

export default function Sobre() {
    return (
        <View style={styles.container}>
            <Text>Página de Sobre </Text>
            <StatusBar style="auto" />
        </View>
    )
}
