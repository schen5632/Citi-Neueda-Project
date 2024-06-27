document.addEventListener('DOMContentLoaded', function() {
    // Retrieve data from localStorage
    // localStorage.clear();
    const storedData = localStorage.getItem('myData');
    if (storedData) {
        const dataList = JSON.parse(storedData);
        console.log("display data: ", dataList);
        // Display data in Account page
        const dataDisplay = document.getElementById('MyStocks');
        dataDisplay.innerHTML = '';
        dataList.forEach(data => {
            console.log(data);
            const itemElement = document.createElement('article');
            itemElement.className = 'data-item';
            itemElement.innerHTML = `
                <p>Ticker: ${data.ticker}</p>
                <p>Stock: ${data.name}</p>
                <p>Shares: ${data.shares}</p>
                <p>Price: ${data.price}</p>
            `;
            dataDisplay.appendChild(itemElement);
        })
        // Optionally, clear localStorage after use
        // localStorage.removeItem('myData');

    } else {
        console.log('No data found in localStorage');
    }
});