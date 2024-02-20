import logo from './logo.svg';
import './App.css';
import FirstComponent from './components/FirstComponenent';
import ListingComponents from './components/ListingComponents';
import Conditionnal from './components/Conditionnal';

function App() {
  return (
    <div className="App">
      <FirstComponent/>
      <ListingComponents/>
      <Conditionnal/>
    </div>
  );
}

export default App;
