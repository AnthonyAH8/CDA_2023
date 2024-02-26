import { useParams, useSearchParams } from "react-router-dom";

const Project = () => {

    const { monparams } = useParams()
    const [searchParams, setSearchParams] = useSearchParams()

    const mode = searchParams.get('mode') ?? "default"
    const toto = searchParams.get("toto") ?? 0

    return (
        <>
            <h1>Ma page projet n°{monparams}</h1>
            <p>Mode = {mode}</p>
            <p>Toto = {toto}</p>
        </>
    );
}

export default Project;