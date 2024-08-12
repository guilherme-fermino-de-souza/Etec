import React, { useState } from 'react';
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button, TouchableOpacity, Image, TextInput } from 'react-native';

export default function App() {

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
          color: 'green', 
          width: '100%', 
          margin: 20, }}
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
        <Text style={styles.nomes}> vitóriaDaMáquina </Text>
        </View>

        <View style={styles.placar}>
        <Text style={styles.nomes}> MÁQUINA </Text>
        <Text style={styles.nomes}> vitóriaDoJogador </Text>
        </View>
      </View>

      {/* IMAGENS */}
      <View style={styles.imagens}>
        <View style={{margin:'auto', width:'40%'}}>
        </View>
        <Text style={{marginTop: 25,margin: 10, fontSize: 35, color: '#F2CB05'}}>VS</Text>
        <View style={{margin:'auto', width:'40%'}}>
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
        <TouchableOpacity >
          <Image 
            style={{width:80, height:80, margin: '0 auto'}}
            source={{uri:"https://cdn-icons-png.flaticon.com/128/3562/3562093.png"}}
            />
        </TouchableOpacity>

        <TouchableOpacity >
          <Image 
            style={{width:80, height:80, margin: '0 auto'}}
            source={{uri:"https://cdn-icons-png.flaticon.com/128/12355/12355903.png"}}
            />
        </TouchableOpacity>

        <TouchableOpacity >
          <Image 
            style={{width:80, height:80, margin: '0 auto'}}
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
