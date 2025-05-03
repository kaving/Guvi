document.getElementById('searchBtn').addEventListener('click',function(){
    const username = document.getElementById('username').value;
    const resltdiv = document.getElementById('result');
    
    fetch(`https://api.github.com/users/${username}`)
    .then(response => {
        if (!response.ok) {
            throw new Error('User not found');
        }
        return response.json();
    }
    )
    .then(data => {
        resltdiv.innerHTML = `
            <h2>${data.login}</h2>
            <img src="${data.avatar_url}" alt="${data.login}" width="100">
            <p>Followers: ${data.followers}</p>
            <p>Following: ${data.following}</p>
            <p>Public Repos: ${data.public_repos}</p>
        `;
    })
    .catch(error => {
        resltdiv.innerHTML = `<p style="color:red;">${error.message}</p>`;
    });
    resltdiv.innerHTML = '<p>Loading...</p>';
    resltdiv.innerHTML = '';
  })