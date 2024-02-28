import { useEffect, useState } from "react";
import axios from "axios"
import { Link } from "react-router-dom"

const CountryList = () => {
    const [countries, setCountries] = useState([])
    const [search, setSearch] = useState('');

    useEffect(() => {
        axios.get('https://restcountries.com/v3.1/all')
            .then(response => {
                setCountries(response.data)
            })
    }, [])

    const filter = countries.filter((country) =>
        country.translations.fra.common.toLowerCase().includes(search.toLowerCase())
    )
    return (
        <div className="d-flex flex-wrap flex-column">
            <h1 className="text-center">Liste des pays</h1>
            <input
                type="text"
                placeholder="Rechercher par nom de pays"
                value={search}
                onChange={(e) => setSearch(e.target.value)}
                className="mb-3 mx-3 rounded"
            />
            <div className="d-flex justify-content-center flex-wrap gap-4">
                {
                    filter.map((country) => (
                        <div key={country.id} className="d-flex justify-content-center text-center card mt-3 align-items-center p-3" style={{ backgroundColor: '#C0C0C0' }}>
                            <p className="fw-bold">{country.translations.fra.common}</p>
                            <img src={country.flags.png}
                                className="card-img-top h-50 rounded my-3"></img>
                            <p><span className="fw-bolder">Capitale:</span> {country.capital}</p>
                            <p><span className="fw-bolder">Région:</span> {country.region}</p>
                            <p><span className="fw-bolder">Nombre d'habitants:</span> {country.population}</p>
                        </div>
                    ))
                }
            </div>
        </div>
    );
}

export default CountryList;