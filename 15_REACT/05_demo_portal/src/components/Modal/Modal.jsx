import { createPortal } from 'react-dom';
import classes from './Modal.module.css'

const Modal = (props) => {
    return createPortal( 
        <div className={classes.modal}>
            <div className={classes.modalContent}>
                {props.children}
            </div>
        </div>,
        document.body
     );
}
 
export default Modal;