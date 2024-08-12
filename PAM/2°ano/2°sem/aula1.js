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
        return <Image source={{ uri: 'https://cdn-icons-png.flaticon.com/128/3562/3562093.png' }} style={styles.img} />;
      case 2:
        return <Image source={{ uri: 'https://cdn-icons-png.flaticon.com/128/12355/12355903.png' }} style={styles.img} />;
      case 3:
        return <Image source={{ uri: 'https://cdn-icons-png.flaticon.com/128/17392/17392068.png' }} style={styles.img} />;
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
        margin: '0 auto'
      }}>
        <Text style={{
          fontSize: 35,
          color: '#F2CB05',
          borderBottomWidth: 4, // largura
          borderBottomColor: 'red', // cor
        }}>JOKENPO</Text>
      </View>

      {/* PLACAR */}
      <View>
        <View style={styles.placar}>
        <Text style={{color: 'white',}}> PLACAR </Text>
        <TextInput style={{
          fontSize: 30, 
          fontWeight: 600, 
          color: 'blue', 
          width: '100%', 
          backgroundColor: 'green', 
          margin: 20, }}
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
        <Text style={styles.nomes}> JOGADOR </Text>
        <Text style={styles.nomes}> {machinewins} </Text>
        </View>

        <View style={styles.placar}>
        <Text style={styles.nomes}> MÁQUINA </Text>
        <Text style={styles.nomes}> {playerwins} </Text>
        </View>
      </View>

      {/* IMAGENS */}
      <View style={styles.imagens}>
        <View style={{margin:'auto', width:'40%'}}>
          {exibirImagem(playerChoice)}
        </View>
          <Text style={{marginTop: 25,margin: 10, fontSize: 35, color: '#F2CB05'}}>VS</Text>
        <View style={{margin:'auto', width:'40%'}}>
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
      <View style={styles.jogo}>
        <TouchableOpacity onPress={() => jogo(1)}>
          <Image 
            style={{width:80, height:80, margin: '0 auto'}}
            source={{uri:"https://cdn-icons-png.flaticon.com/128/3562/3562093.png"}}
            />
        </TouchableOpacity>

        <TouchableOpacity onPress={() => jogo(2)}>
          <Image 
            style={{width:80, height:80,  margin: '0 auto'}}
            source={{uri:"https://cdn-icons-png.flaticon.com/128/12355/12355903.png"}}
            />
        </TouchableOpacity>

        <TouchableOpacity onPress={() => jogo(3)}>
          <Image style={{width:80, height:80, margin: '0 auto'}}
          source={{uri:"https://cdn-icons-png.flaticon.com/128/17392/17392068.png"}}/>
        </TouchableOpacity>
      </View>
      
    </View>
  )};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#032859',
    alignItems: 'center',
    justifyContent: 'center',
    width: 'auto',
  },
  view: {
    display: 'flex',
    flexDirection: 'row',
    margin: 'auto 2%',
  },
  imagens: {
    display: 'flex',
    flexDirection: 'row',
    margin: '0%',
  },
  jogo: {
    display: 'flex',
    flexDirection: 'row',
    marginHorizontal: "auto",
    marginVertical: 10,
    backgroundColor: 'yellow'
  },
  placar: {
    display:'flex',
    flexDirection: 'column',
    alignItems: 'center',
    margin: 'auto',
    width: '50%'
  },
  nomes: {
    color: 'white',
    fontSize: 20,
    margin: 15,
  },
  img: {
    width:100,
    height:100,
    margin: 10,
  },
});
