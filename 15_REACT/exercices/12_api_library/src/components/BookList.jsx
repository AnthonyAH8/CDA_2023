import { useEffect } from "react";
import { useState } from "react";
import axios from "axios"
import { Link } from "react-router-dom"


const BookList = () => {

    const [books, setBooks] = useState([])

    useEffect(() => {
        axios.get('https://openlibrary.org/subjects/fantasy.json?limit=10')
            .then(response => {
                setBooks(response.data.works)
                console.log(response.data)
            })
    }, [])

    return (
        <div className="d-flex flex-wrap flex-column">
            <h1 className="text-center my-5">Librairie API</h1>
            <div className="d-flex justify-content-center flex-wrap gap-5">
                {
                    books.map((book) => (
                        <div key={book.key} className="d-flex text-center card align-items-center p-3 border border-dark w-25 my-3">
                            <img src={`https://covers.openlibrary.org/b/id/${book.cover_id}-L.jpg`} alt="" className="w-25 my-4" />
                            <p><span className="fw-bolder">Titre du livre:</span> {book.title}</p>
                            <Link to={`/detail/${book.key}`} className="btn btn-primary">Détail du livre</Link>
                        </div>
                    ))
                }
            </div>
        </div>
    );
}

export default BookList;