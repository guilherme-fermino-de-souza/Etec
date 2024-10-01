import { StyleSheet } from "react-native";

export default StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#e8f0fe',
    alignItems: 'center',
    justifyContent: 'center',
  },
  inputArea:{
    height: 50,
    marginTop: 30,
    width:'80%',
  },
  imageArea:{
    flex:1,
    width:'100%',
    backgroundColor:'blue'
  },
  buttonArea:{
    flex:0.7,
    width:'100%',
    flexDirection:'row',
    backgroundColor: '#e8f0fe',
  },
  input:{  //Textfield
    height: 40,
    borderColor: '#ccc',
    borderWidth: 1,
    marginBottom: 12,
    paddingHorizontal: 10,
    borderRadius: 5,
  },
  button:{
    borderWidth:2,
    width:'35%',
    height:35,
    marginLeft:'10%',
    marginTop:20,
    borderRadius:30,
    justifyContent:'center',
    alignItems:'center',
    backgroundColor: '#0C0C0D',
  },
  buttontext:{
    color: '#e8f0fe',
  },
  textInput:{
    alignSelf:'center',
    fontSize: 16,
    color: '#0C0C0D',
    marginTop:10,
    marginBottom:-25,
  }, 
  });
