import {createPortal} from 'react-dom'

const Modal = (props) => {
    return createPortal( 
        <div>
            <div>
                {props.children}
            </div>
        </div>,
        document.body
     );
}
 
export default Modal;