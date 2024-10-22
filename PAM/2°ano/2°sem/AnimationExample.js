import { StatusBar } from 'expo-status-bar';
import { Pressable, StyleSheet, Text, View } from 'react-native';
import * as Animatable from 'react-native-animatable';

export default function App() {
  return (
  <View style={styles.container}>
    <Animatable.View  style={styles.animatable1} animation="fadeIn" duration={1000} delay={2000}>
        <Text>up App.js to start working on your app!</Text>
    </Animatable.View>
    <Animatable.View  style={styles.animatable2} animation="fadeInDown" duration={1000} delay={2000}>
        <Text>up App.js to start working on your app!</Text>
    </Animatable.View>
    <Animatable.View  style={styles.animatable3} animation="fadeInUp" duration={1000} delay={2000}>
        <Text>up App.js to start working on your app!</Text>
    </Animatable.View>
    <Animatable.View  style={styles.animatable4} animation="fadeInLeft" duration={1000} delay={2000}>
        <Text>up App.js to start working on your app!</Text>
    </Animatable.View>
  </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'black',
    alignItems: 'center',
    justifyContent: 'center',
  },
  animatable1: {
    color: 'black',
    backgroundColor: 'red',
    fontFamily: 'arial',
    fontSize: '24',
    margin: 10,
  },
  animatable2: {
    color: 'black',
    backgroundColor: 'yellow',
    fontFamily: 'arial',
    fontSize: '24',
    margin: 10,
  },
  animatable3: {
    color: 'black',
    backgroundColor: 'green',
    fontFamily: 'arial',
    fontSize: '24',
    margin: 10,
  },
  animatable4: {
    color: 'black',
    backgroundColor: 'blue',
    fontFamily: 'arial',
    fontSize: '24',
    margin: 10,
  },
});
