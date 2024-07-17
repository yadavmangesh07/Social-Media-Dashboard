import React from 'react';
import UserDetails from './components/UserDetails';
import Analytics from './components/Analytics';
function App() {
    return (
        <div className="App">
            <h1 className='text-center'>Social Media Analytics Dashboard</h1>
            <UserDetails />
            <Analytics />
        </div>
    );
}

export default App;
