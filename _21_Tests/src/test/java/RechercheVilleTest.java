import org.example.RechercheVille;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RechercheVilleTest {
    private RechercheVille rechercheVille;

//    @Test
//    public void less_Than_2_characters(){
//        rechercheVille = new RechercheVille();
//        throw new RuntimeException("Au minimum 2 caractères");
//    }

    @Test
    public void moreThanTwoCharacters() {
        List<String> cities = new ArrayList<>();
        cities.add("Valence");
        cities.add("Vancouver");

        List<String> expected = new ArrayList<>(cities);

        List<String> result = new ArrayList<>();
        String searchText = "Va";

        for (String city : cities) {
            if (city.startsWith(searchText)) {
                result.add(city);
            }
        }

        Assert.assertEquals(expected, result);
    }

    @Test
    public void any_Case(){

    }

    @Test
    public void searchByLetters(){

    }

    @Test
    public void allCities(){

    }

}
