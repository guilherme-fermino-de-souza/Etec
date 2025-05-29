import React, {useState} from "react"
import {  View, StyleSheet, Text, TextInput, TouchableOpacity  } from "react-native"

export default function App() {

  const [cep, setCep] = useState("")
  const [logradouro, setLogradouro] = useState("")
  const [bairro, setBairro] = useState("")
  const [localidade, setLocalidade] = useState("")
  const [uf, setUf] = useState("")

  return (
    <View style={styles.containerPrincipal}>
      
      <View style={styles.topBar}>
        <Text style={styles.title}>Buscador De Cep</Text>
      </View>

      <View style={styles.containerCep}>
        <TextInput
          style={
            {
              borderColor: "#000", borderWidth: 2, borderRadius: 5,padding: 10, width: 200, fontSize: 18, marginVertical: 20
            }
          }
          value={cep}
          onChangeText={(texto) => setCep(texto)}
          maxLength={8}
          keyboardType="numeric"
          placeholder="Digite o CEP"
        />

        <TouchableOpacity style={styles.botaoBuscar}>
          <Text>Buscar</Text>
        </TouchableOpacity>
      </View>
          
        <TextInput
          style={styles.caixaTexto}
          value={logradouro}
          onChangeText={(texto) => setLogradouro(texto)}
          placeholder="Logradouro"
        />


        <TextInput
          style={styles.caixaTexto}
          value={bairro}
          onChangeText={(texto) => setBairro(texto)}
          placeholder="Bairro"
        />

        <TextInput
          style={styles.caixaTexto}
          value={localidade}
          onChangeText={(texto) => setLocalidade(texto)}
          placeholder="Cidade"
        />

        <TextInput
          style={
            {
              borderColor: "#000", borderWidth: 2, borderRadius: 5,padding: 10, width: 80, fontSize: 18, marginVertical: 10, marginHorizontal: 20 
            }
          }
          value={uf}
          onChangeText={(texto) => setUf(texto)}
          placeholder="Estado (UF)"
        />

    </View>
  )
}

const styles = StyleSheet.create({
  containerPrincipal: {
    flex: 1, // Ocupa todo o espaço disponível
    flexDirection: "column",
  },
  topBar: {
    flexDirection: "row",
    height: 70, // Altura da barra superior
    backgroundColor: "#f8f8f8", // Cor de fundo da barra superior
  },
  title: {
    fontSize: 25, // Tamanho da fonte do título
    fontWeight: "bold", // Negrito
    color: "#333", // Cor do texto
    alignSelf: "center", // Centraliza verticalmente
    margin: 10,
  },
  containerCep: {
    flexDirection: "row",
    height: 100,
    marginHorizontal: 20,
  },
  botaoBuscar: {
    backgroundColor: "#007BFF", // Cor de fundo do botão
    width: 120,
    height: 70,
    marginTop: 30,
    marginEnd: 20,
    borderRadius: 10,
    padding: 20,
  },
  textoBotaoBuscar: {
    color: "#fff", // Cor do texto do botão
    fontSize: 18,
    fontWeight: "bold", // Negrito
    alignSelf: "center", // Centraliza o texto dentro do botão
  },
  caixaTexto: {
    borderColor: "#000",
    borderWidth: 2,
    padding: 15,
    fontSize: 18,
    borderRadius: 10,
    marginTop: 10,
    marginHorizontal: 20,
  }
  }
)
