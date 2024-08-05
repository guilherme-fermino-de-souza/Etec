import React, { useState } from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button, TouchableOpacity, Image, TextInput } from 'react-native';

export default function App() {
  const [resultado, setResultado] = useState('');
  const [playerwins, setPlayerwins] = useState(0);
  const [machinewins, setMachinewins] = useState(0);
  const [machineChoice, setMachineChoice] = useState(null);
  const [playerChoice, setPlayerChoice] = useState(null);

  const minJogada = 1
  const maxJogada = 3

  const jogo = (playerSelection) => {
    const machineSelection = Math.floor(Math.random() * (maxJogada - minJogada + 1)) + minJogada
    setPlayerChoice(playerSelection);
    setMachineChoice(machineSelection);

    if (playerSelection === machineSelection) { // EMPATE
        setResultado("EMPATE!");
    } else if // VITÓRIA
    (playerSelection === 1 && machineSelection === 3 ||
      playerSelection === 2 && machineSelection === 1 ||
      playerSelection === 3 && machineSelection === 2){
        setResultado("VITÓRIA!");
        setPlayerwins(playerwins => playerwins + 1);    
    } else {
      setResultado("DERROTA!");
      setMachinewins(machinewins => machinewins + 1);
    }
  };
    
 
  const exibirImagem = (escolha) => {
    switch (escolha) {
      case 1:
        return <Image source={{ uri: 'https://www.playclick.com.br/jogo_jokenpo/img/pedra.png' }} style={styles.img} />;
      case 2:
        return <Image source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpEBk3izn0lexaAO-MHv9xzXYLITSr7G6ZaHo9D212yy9DuUBOkqRkwGUOZoL_SPbp4jM&usqp=CAU' }} style={styles.img} />;
      case 3:
        return <Image source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYq3zekA2TVgoHVm4yHySKms7HHQePyGX4fjtctPs-N7n5Jy8KyBQHZVpd04WVp6wM3t4&usqp=CAU' }} style={styles.img} />;
      default:
        return null;
    }
  };

  return (
    <View style={styles.container}>
       <StatusBar style='auto' />
      {/* TÍTULO */}
      <View style={{
        marginBottom: 20,
        marginLeft: 45,
      }}>
        <Text style={{
          fontSize: 35,
          color: '#F2CB05',
          borderBottomWidth: 4, // largura
          borderBottomColor: 'red', // cor
        }}>JOKENPO</Text>
      </View>

      {/* PLACAR */}
      <View style={styles.view}>
        <View style={styles.placar}>
        <Text> PLACAR </Text>
        <TextInput style={{fontSize: 20, marginLeft: '50%', color: 'red'}}
          value={resultado}
          placeholder="RESULTADO"
          maxLength={25}
          editable={false}
          />
        </View>
      </View>

      {/* CONTAGEM */}
      <View style={styles.view}>
        <View style={styles.placar}>
        <Text> JOGADOR </Text>
        <Text> {machinewins} </Text>
        </View>

        <View style={styles.placar}>
        <Text> MÁQUINA </Text>
        <Text> {playerwins} </Text>
        </View>
      </View>

      {/* IMAGENS */}
      <View style={styles.view}>
        <View style={{borderWidth:1, flex:2, justifyContent:'center', alignItems:'center', width:'100%'}}>
          {exibirImagem(playerChoice)}
        </View>
          <Text>VS</Text>
        <View style={{borderWidth:1, flex:2, justifyContent:'center', alignItems:'center', width:'100%'}}>
          {exibirImagem(machineChoice)}
        </View>
      </View>

      {/* BOTÃO NOVA PARTIDA
      <View style={styles.view}>
        <Button style={styles.butao}
        title="VER RESULTADOS"
        color="gray"
        onPress={jogo}/>
      </View>
      */}

      {/* JOGO */}
      <View style={styles.view}>
        <TouchableOpacity onPress={() => jogo(1)}>
          <Image 
            style={{width:80, height:160, marginRight: '45%'}}
            source={{uri:"https://www.playclick.com.br/jogo_jokenpo/img/pedra.png"}}
            />
        </TouchableOpacity>

        <TouchableOpacity onPress={() => jogo(2)}>
          <Image 
            style={{width:80, height:160,  marginLeft: '15%'}}
            source={{uri:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpEBk3izn0lexaAO-MHv9xzXYLITSr7G6ZaHo9D212yy9DuUBOkqRkwGUOZoL_SPbp4jM&usqp=CAU"}}
            />
        </TouchableOpacity>

        <TouchableOpacity onPress={() => jogo(3)}>
          <Image style={{width:80, height:160, marginLeft: '45%'}}
          source={{uri:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYq3zekA2TVgoHVm4yHySKms7HHQePyGX4fjtctPs-N7n5Jy8KyBQHZVpd04WVp6wM3t4&usqp=CAU"}}/>
        </TouchableOpacity>
      </View>
      
    </View>
  )};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  view: {
    display: 'flex',
    flexDirection: 'row',
    marginTop: '0.5%',
  },
  placar: {
    display:'flex',
    flexDirection: 'column',
    alignItems: 'center',
    margin: '5%',
  },
  img: {
    width:50,
    height:90,
  },
});
