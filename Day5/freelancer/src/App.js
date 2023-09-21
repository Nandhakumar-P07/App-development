import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Login from './pages/Login/Login';
import Signup from './pages/Signup';
import LoginFreelancer from './pages/Login/LoginFreelancer';
import LoginClient from './pages/Login/LoginClient';
import Home from './pages/Home';
import Dashboard from './Users/Freelancer/Dashboard/Dashboard';
function App() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path='/login' element={<Login/>}/>
          <Route path='/signup' element={<Signup/>}/>
          <Route path='/loginfreelancer' element={<LoginFreelancer/>}/>
          <Route path='/loginclient' element={<LoginClient/>}/>
          <Route path='/' element={<Home/>}/>
          <Route path='/dashboard' element={<Dashboard/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
