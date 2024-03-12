import { StyleSheet, Text, View, Image } from 'react-native'
import React from 'react'
// import SecondDemo from '../demo/components/SecondDemo'
import ShoppingList from '../demo/components/ShoppingList'
import Calculator from '../demo/components/Calculator'

export default function App() {
    return (
        // <View style={styles.container}>
        //     {/* <Text style={[styles.title, styles.height]}>Hello world !</Text> */}
        //     <View>
        //         <Image
        //             style={styles.monImage}
        //             source={{ uri: 'https://cdn001.tintin.com/public/tintin/img/static/le-capitaine-haddock/captain-haddock_v2.jpg' }}
        //         />
        //     </View>
        //     <View style={styles.infos}>
        //         <Text style={styles.height}>Nom: <Text style={styles.information}>Capitaine</Text></Text>
        //         <Text style={styles.height}>Prénom: <Text style={styles.information}>Haddock</Text></Text>
        //         <Text style={styles.height}>Téléphone: <Text style={styles.information}>01.23.45.67.89</Text></Text>
        //         <Text style={styles.height}>Adresse: <Text style={styles.information}>35 rue des Pias 59200 Tourcoing</Text></Text>
        //     </View>
        // </View>
        // <SecondDemo/>
        // <ShoppingList/>
        <Calculator/>
    )
}

// const styles = StyleSheet.create({
//     container: {
//         backgroundColor: "#FAEBD7",
//         flex: 1,
//         display: 'flex',
//         alignItems: 'center',
//         justifyContent: 'center',
//     },
//     height: {
//         fontSize: 18
//     },
//     monImage: {
//         width: 120,
//         height: 120,
//         borderRadius: 100,
//         marginBottom: 50
//     },
//     infos: {
//         display: 'flex',
//         justifyContent: 'center',
//         alignItems: 'start',
//     },
//     information: {
//         fontWeight: 'bold'
//     }
// })