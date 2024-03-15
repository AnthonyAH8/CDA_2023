import { FlatList, Image, StyleSheet, Text, TouchableOpacity, View } from 'react-native'
import React from 'react'
import { MEALS } from '../data/data'

export default function DetailsRecette({ navigation }) {
  return (
    <View style={styles.container}>
      <FlatList
        data={MEALS}
        renderItem={({ item }) => {
          return (
            <TouchableOpacity onPress={() => navigation.navigate("DescriptionRecette")}>
              <View style={styles.recette}>
                <Image
                  source={{ uri: item.imageUrl }}
                  style={styles.image} />
                <View
                style={styles.infos}>
                  <Text
                  style={styles.title}>{item.title}</Text>
                  <Text>{item.duration} {item.complexity} {item.affordability}</Text>
                </View>
              </View>
            </TouchableOpacity>
          )
        }}
        keyExtractor={(item) => item.id}
      />
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    flexDirection: 'row'
  },
  recette: {
    width: 200,
    height: 200,
    borderRadius: 10,
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    shadowColor: 'black',
    shadowOffset: {height: 3, width: 3},
    shadowOpacity: 0.5,
  },
  image: {
    width: 200,
    height: 200,
    resizeMode: 'cover',
  },
  infos:{
    marginVertical: 10
  },
  title:{
    color: 'grey',
    fontWeight:'bold'
  }
})