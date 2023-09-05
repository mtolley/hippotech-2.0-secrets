import * as React from 'react';
import Grid from '@mui/material/Grid';
import Container from '@mui/material/Container';
import Header from './Header';
import MainFeaturedPost from './MainFeaturedPost';
import FeaturedPost from './FeaturedPost';
import server from '../server';

const sections = [
  { title: 'House Prices', url: '#' },
  { title: 'Upsizing', url: '#' },
  { title: 'New Parents', url: '#' },
  { title: 'Buy to let', url: '#' },
  { title: 'Opinion', url: '#' },
  { title: 'Remortgaging', url: '#' },
];

export default function Blog() {
  let [posts, setPosts]= React.useState([]);

  React.useEffect(() => {
    async function loadData() {
      const result = await server.getBlogPostsAsync();
      setPosts(result);
    }
    loadData();
  }, []);

  return (
    // <ThemeProvider theme={theme}>
    //   <CssBaseline />
    <Grid  style={{ minHeight: '100vh', padding: '50px' }} container component="main" > 
      <Container maxWidth="lg">
        <Header title="Blog" sections={sections} />
        <main>
        {
          posts.length && <MainFeaturedPost post={posts[0]} />
        }
        {
          posts.length >1 && <Grid container spacing={4}>
            {posts.slice(1).map((post, i) => (
              <FeaturedPost key={post.title} post={post} postNumber={i+2} />
            ))}
          </Grid>
        }

        </main>
      </Container>

      {/* </ThemeProvider> */}
    </Grid>
     
  );
}
