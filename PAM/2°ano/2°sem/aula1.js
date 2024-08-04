import React, { useState } from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button, TouchableOpacity, Image, TextInput } from 'react-native';

export default function App() {
  const [resultado, setResultado] = useState('');
  const [playerwins, setPlayerwins] = useState(0);
  const [machinewins, setMachinewins] = useState(0);

  const minJogada = 1
  const maxJogada = 3

  const jogo = () => {
    const jogada = Math.floor(Math.random() * (maxJogada - minJogada + 1)) + minJogada
    if(jogo === 1) { // PEDRA
      if(jogada === 1 ){
        setResultado("EMPATE!");
      } else if(jogada === 2){
        setResultado("DERROTA!");
        setMachinewins(machinewins => machinewins + 1);
      } else {
        setResultado("VITÓRIA!");
        setPlayerwins(playerwins => playerwins + 1);
      }
    } else if(jogo === 2){ // PAPEL
      if(jogada === 1){
        setResultado("VITÓRIA!");
        setPlayerwins(playerwins => playerwins + 1);
      } else if(jogada === 2){
        setResultado("EMPATE!");
      } else {
        setResultado("DERROTA!");
        setMachinewins(machinewins => machinewins + 1);
      }
    } else { // TESOURA 
      if(jogada === 1){
        setResultado("DERROTA!");
        setMachinewins(machinewins => machinewins + 1);
      } else if(jogada==2){
        setResultado("VITÓRIA!");
        setPlayerwins(playerwins => playerwins + 1);
      } else {
        setResultado("EMPATE!");
      }
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
        <Text> MÁQUINA </Text>
        <Text> {machinewins} </Text>
        </View>

        <View style={styles.placar}>
        <Text> JOGADOR </Text>
        <Text> {playerwins} </Text>
        </View>
      </View>

      {/* CAIXAS */}
      <View style={styles.view}>
        <Image style={{width:150,height:150}}
        source={{uri:"https://w7.pngwing.com/pngs/424/347/png-transparent-question-block-super-mario-icon-thumbnail.png"}}/>
        <Text>VS</Text>
        <Image style={{width:150,height:150}} 
        source={{uri:"https://w7.pngwing.com/pngs/424/347/png-transparent-question-block-super-mario-icon-thumbnail.png"}}/>
      </View>

      {/* BOTÃO NOVA PARTIDA*/}
      <View style={styles.view}>
        <Button style={styles.butao}
        title="VER RESULTADOS"
        color="gray"
        onPress={jogo}/>
      </View>

      {/* JOGO */}
      <View style={styles.view}>
        <TouchableOpacity onPress={() => jogo(1)}>
          <Image 
            style={{width:120, height:200}}
            source={{uri:"https://www.playclick.com.br/jogo_jokenpo/img/pedra.png"}}
            />
        </TouchableOpacity>

        <TouchableOpacity onPress={() => jogo(2)}>
          <Image 
            style={{width:100,height:200}}
            source={{uri:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpEBk3izn0lexaAO-MHv9xzXYLITSr7G6ZaHo9D212yy9DuUBOkqRkwGUOZoL_SPbp4jM&usqp=CAU"}}
            />
        </TouchableOpacity>

        <TouchableOpacity onPress={() => jogo(3)}>
          <Image style={{width:105,height:200}}
          source={{uri:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYq3zekA2TVgoHVm4yHySKms7HHQePyGX4fjtctPs-N7n5Jy8KyBQHZVpd04WVp6wM3t4&usqp=CAU"}}/>
        </TouchableOpacity>
      </View>
      
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
});
