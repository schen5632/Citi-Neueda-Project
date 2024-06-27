document.getElementById('search-form').addEventListener('submit', function(event) {
    event.preventDefault();
    const inputData = document.getElementById('stock').value;
    console.log(inputData);
    fetchData(inputData);
});

function fetchData(inputValue) {
    const apiUrl = `http://localhost:8081/stocks/by-name?name=${encodeURIComponent(inputValue)}`;

    console.log(apiUrl);
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => displayData(data[0]))
        .catch(error => {
            console.error('Error fetching data:', error);
            document.getElementById('SearchStocks').innerText = 'Failed to fetch data.';
        });
}

function displayData(data) {
    console.log(data);
    const dataDisplay = document.getElementById('SearchStocks');
    dataDisplay.innerHTML = ''; // Clear any existing data

    if (typeof data === 'object' && data !== null) {
        console.log('data exists');
        const itemElement = document.createElement('article');
        itemElement.className = 'data-item';

        itemElement.innerHTML = `
            <p>Ticker: ${data.ticker}</p>
            <p>Stock name: ${data.name}</p>
            <p>Price: ${data.price}</p>
            <button class="BuyButton">Buy</button>
        `;
        dataDisplay.appendChild(itemElement);

        const loginDialog = document.querySelector("#login-dialog");
        const dialog = document.querySelector("#buy-dialog");
        const showButton = document.querySelector(".BuyButton");
        // const closeButton = document.querySelector("#login-dialog + button");

        // "Show the dialog" button opens the dialog modally
        showButton.addEventListener("click", () => {
            console.log("buy");
            dialog.showModal();
            loginDialog.showModal();
        });

        const buyModal = document.getElementById('buy-dialog');
        buyModal.innerHTML = '';

        const itemElement2 = document.createElement('article');
        // itemElement2.className = 'data-item';

        let shares = '1';
        itemElement2.innerHTML = `
            <form id="sell-form">
                <p>Ticker: ${data.ticker}</p>
                Your balance: Infinite<br>
                <p>Stock: ${data.name}</p>
                Shares: <input type="number" name="" id="shares">
                <p>Price/Share: ${data.price}</p>
            </form>
            <form method="dialog" >
                <button style="background-color: red;" class="ConfirmButton">Confirm</button>
                <button style="background-color: orange;">Cancel</button>
            </form>
        `;
        buyModal.appendChild(itemElement2);

        const inputField = document.getElementById('shares');
        inputField.addEventListener('input', function() {
            shares = inputField.value;
        });

        const confirmButton = document.querySelector(".ConfirmButton");
        confirmButton.addEventListener("click", () => {
            console.log("confirm clicked!");
            let dataList = JSON.parse(localStorage.getItem('myData')) || [];
            data.shares = shares;
            dataList.push(data);
            localStorage.setItem('myData', JSON.stringify(dataList));
        });


    } else {
        dataDisplay.innerHTML = '<p>Could not find stock!</p>';
    }
}
