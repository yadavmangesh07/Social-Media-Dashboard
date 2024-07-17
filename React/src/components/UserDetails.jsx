import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Card, CardContent, Typography, Grid, Box } from '@mui/material';

const UserDetails = () => {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/api/users')
            .then(response => setUsers(response.data))
            .catch(error => console.error(error));
    }, []);

    return (
        <Box sx={{ padding: 4 }}>
            <Typography variant="h4" gutterBottom>
                User Details
            </Typography>
            <Grid container spacing={3}>
                {users.map(user => (
                    <Grid item xs={12} sm={6} md={4} key={user.id}>
                        <Card variant="outlined" sx={{ height: '100%', display: 'flex', flexDirection: 'column' }}>
                            <CardContent>
                                <Typography variant="h6" component="div" gutterBottom>
                                    {user.name}
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Category: {user.category}
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Bio: {user.bio}
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Contact Options: {user.contactOptions}
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Links: {user.links}
                                </Typography>
                            </CardContent>
                        </Card>
                    </Grid>
                ))}
            </Grid>
        </Box>
    );
}

export default UserDetails;
