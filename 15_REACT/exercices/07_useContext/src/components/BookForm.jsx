import { useRef } from "react";

const BookForm = ({ book }) => {
    const titleRef = useRef('')
    const authorRef = useRef('')
    const descriptionRef = useRef('')

    const addBook = (e) => {
        e.preventDefault()
        const newBook = {
            title: titleRef.current.value,
            author: authorRef.current.value,
            description: descriptionRef.current.value,
        }
        book(newBook)

        titleRef.current.value = ''
        authorRef.current.value = ''
        authorRef.current.value

    }
    return (
        <>

        </>
    );
}

export default BookForm;