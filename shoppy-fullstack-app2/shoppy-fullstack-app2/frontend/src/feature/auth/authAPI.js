import { login, logout } from '../../feature/auth/authSlice.js';
import { validateFormCheck, validateSignupFormCheck } from '../../utils/validate.js';
import {axiosPost} from "../../utils/dataFetch.js";

/**
 *  ID 중복 체크
 */
export const getIdCheck=(id)=>async(dispatch)=>{
    const data = {"id":id};
    const url="http://localhost:8080/member/idchect";
    const

}

export const getLogin = (formData, param) => async(dispatch) => {

    if(validateFormCheck(param)) {
        if("test" === formData.id && "1234" === formData.pwd) {
            dispatch(login({"userId":formData.id}));
            return true;
        }
    }
    return false;
}

export const getLogout = () => async(dispatch) => {
    dispatch(logout());
    return true;
}