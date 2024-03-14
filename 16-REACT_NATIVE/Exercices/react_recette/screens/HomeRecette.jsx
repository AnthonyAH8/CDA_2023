import React from 'react';
import { FlatList, StyleSheet, Text, TouchableOpacity, View } from 'react-native';
import { CATEGORIES } from '../data/data';

export default function HomeRecette({ navigation }) {
  return (
    <View style={styles.container}>
      <FlatList
        data={CATEGORIES}
        numColumns={2}
        renderItem={({ item }) => {
          return (
            <TouchableOpacity onPress={() => navigation.navigate("DetailsRecette", { category: item })}
            style={styles.main}>
              <View style={[styles.item,{ backgroundColor: item.color }]}>
                <Text style={styles.category}>{item.title}</Text>
              </View>
            </TouchableOpacity>
          );
        }}
        keyExtractor={(item) => item.id}
      />
    </View>
  );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: 'center',
    },
    item:{
        width: 160,
        height: 160,
        display: 'flex',
        color: 'white',
        textAlign: 'center',
        alignItems: 'center',
        justifyContent: 'center',
        margin: 20,
        borderRadius: 10,
    },
    category:{
        color: 'white',
        fontWeight: 'bold',
        fontSize: 18,
        color: 'darkgrey'
    }
})