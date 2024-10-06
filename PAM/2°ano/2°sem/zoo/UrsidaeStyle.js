import { StyleSheet } from "react-native";
export default StyleSheet.create({
    container: { //Corpo
      flex: 1,
      backgroundColor: '#e8f0fe',
      alignItems: 'center',
      justifyContent: 'center',
    },
    felinosArea:{ //Container
      flex:1,
      flexDirection:'row',
      height:'100%',
      width:'80%',
      marginBottom: 30,
    },
    buttonArea:{ //Area
      height:'100%',
      width:'50%',
    },
    text:{
      fontSize: 24,
      fontWeight: 'bold',
      textAlign: 'center', 
      color: '#BF7E04',
    },
    felinos:{ //Pressable
      width:'100%',
      height:'100%',
    },
    modal: {
      flex: 1,
      justifyContent: 'center',
      alignItems: 'center',
      backgroundColor: '#e8f0fe',
    },
    title: {
      fontSize: 24,
      fontWeight: 'bold',
      marginBottom: 10,
      color: '#BF7E04',
    },
    //MODAL
    secondTitle: {
      fontSize: 20,
      fontWeight: 'bold',
      marginBottom: 30,
      color: 'black',
    },
    description: {
      fontSize: 10,
      color: 'black',
      fontWeight: 500,
      marginBottom: 15,
      textAlign: 'left',
      width: '80%'
    },
    subTitles: {
      fontSize: 16,
      fontWeight: 'bold',
      marginBottom: 30,
      color: '#BF7E04',
    },
    imagemContainer: {
      width: '80%',
      height: '20%',
      marginBottom: 15,
    },
    image: {
      width: '100%',
      height: '100%',
      margin: 5,
    },
  });
