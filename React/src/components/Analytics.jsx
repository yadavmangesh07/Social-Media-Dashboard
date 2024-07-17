import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Card, CardContent, Typography, Grid, Box } from '@mui/material';
import { BarChart, Bar, XAxis, YAxis, Tooltip, CartesianGrid, ResponsiveContainer } from 'recharts';

const Analytics = () => {
    const [analytics, setAnalytics] = useState([]);
    const [users, setUsers] = useState([]);

    useEffect(() => {
        // Fetch analytics data
        axios.get('http://localhost:8080/api/analytics')
            .then(response => {
                setAnalytics(response.data);
                console.log('Analytics:', response.data);
            })
            .catch(error => console.error(error));

        // Fetch user data
        axios.get('http://localhost:8080/api/users')
            .then(response => {
                setUsers(response.data);
                console.log('Users:', response.data);
            })
            .catch(error => console.error(error));
    }, []);

    // Combine analytics with user names
    const combinedData = analytics.map(item => {
        const user = users.find(user => user.id === item.userId); // Assuming item.userId links to user.id
        return {
            name: user ? user.name : 'Unknown', // Fallback to 'Unknown' if user not found
            followers: item.followers,
            following: item.following,
            posts: item.posts,
            accountReach: item.accountReach,
            accountEngaged: item.accountEngaged,
            contentShared: item.contentShared,
            activePromotions: item.activePromotions,
            totalStories: item.totalStories,
            totalFollows: item.totalFollows,
            totalSaves: item.totalSaves,
            totalComments: item.totalComments,
            totalShares: item.totalShares,
        };
    });

    return (
        <Box sx={{ padding: 4 }}>
            <Typography variant="h4" gutterBottom>
                User Analytics
            </Typography>
            <Grid container spacing={3}>
                <Grid item xs={12}>
                    <Card variant="outlined">
                        <CardContent>
                            <Typography variant="h6" gutterBottom>
                                Social Media Analytics Stats
                            </Typography>
                            <ResponsiveContainer width="100%" height={300}>
                                <BarChart data={combinedData}>
                                    <CartesianGrid strokeDasharray="3 3" />
                                    <XAxis dataKey="name" />
                                    <YAxis />
                                    <Tooltip />
                                    <Bar dataKey="followers" fill="#8884d8" />
                                    <Bar dataKey="following" fill="#82ca9d" />
                                    <Bar dataKey="posts" fill="#ffc658" />
                                    <Bar dataKey="accountReach" fill="#ff7300" />
                                    <Bar dataKey="accountEngaged" fill="#0088FE" />
                                    <Bar dataKey="contentShared" fill="#00C49F" />
                                    <Bar dataKey="activePromotions" fill="#FFBB28" />
                                    <Bar dataKey="totalStories" fill="#FF8042" />
                                    <Bar dataKey="totalFollows" fill="#FF5722" />
                                    <Bar dataKey="totalSaves" fill="#673AB7" />
                                    <Bar dataKey="totalComments" fill="#3F51B5" />
                                    <Bar dataKey="totalShares" fill="#9C27B0" />
                                </BarChart>
                            </ResponsiveContainer>
                        </CardContent>
                    </Card>
                </Grid>
            </Grid>
        </Box>
    );
}

export default Analytics;
