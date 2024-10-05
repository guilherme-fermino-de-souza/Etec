import { StyleSheet } from "react-native";

export default StyleSheet.create({
  container: { //Corpo
    flex: 1,
    backgroundColor: '#e8f0fe',
    alignItems: 'center',
    justifyContent: 'center',
  },
  territorioArea:{ //Container
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
  territorio:{ //Pressable
    width:'100%',
    height:'100%',
  },
  header:{
    flex:0.5
  }

});
