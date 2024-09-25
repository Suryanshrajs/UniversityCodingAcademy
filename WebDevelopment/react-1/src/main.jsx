import {createRoot}  from 'react-dom/client';
import {app as NewApp} from './app'     //u can import in any way

const reactProjectRoot = createRoot(document.getElementById("root"));

reactProjectRoot.render(< NewApp/>)   //during render always use Pascal case