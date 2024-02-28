import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from 'react-router-dom'

const BookDetails = () => {

    const [book, setBook] = useState(null)
    const { key } = useParams()

    useEffect(() => {
        axios.get(`https://openlibrary.org/works/${key}.json`)
            .then(response => {
                setBook(response.data)
            })
    }, [key])

    return (
        <>
            <div className="d-flex flex-wrap flex-column">
                <h2 className="text-center my-5">Librairie</h2>
                <div className="d-flex justify-content-center flex-wrap gap-5">
                    <div key={book.key} className="d-flex text-center card align-items-center p-3 border border-dark w-25 my-3">
                        <p><span className="fw-bolder">Titre du livre:</span> {book.title}</p>
                        {book.authors && book.authors.map((author, index) => (
                            <p key={index}><span className="fw-bolder">Auteurs:</span> {`${author.name}`}</p>
                        ))}
                    </div>
                </div>
            </div>
        </>
    );
}

export default BookDetails;