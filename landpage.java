document.addEventListener('DOMContentLoaded', () => {
    // Interaktivitas sederhana untuk tombol Add to Cart
    const cartButtons = document.querySelectorAll('.flavor-card button');

    cartButtons.forEach(button => {
        button.addEventListener('click', (e) => {
            const card = e.target.closest('.flavor-card');
            const flavorName = card.querySelector('h3').innerText;

            // Efek feedback cepat saat diklik
            const originalText = button.innerText;
            button.innerText = 'Added! ✓';
            button.style.backgroundColor = '#2e7d32'; // Warna hijau sementara

            setTimeout(() => {
                button.innerText = originalText;
                button.style.backgroundColor = '';
            }, 1500);

            console.log(`Item ditambahkan: ${flavorName}`);
        });
    });

    // Smooth Scroll untuk link navigasi
    const navLinks = document.querySelectorAll('a[href^="#"]');
    navLinks.forEach(link => {
        link.addEventListener('click', function (e) {
            const targetId = this.getAttribute('href');
            if(targetId !== '#') {
                e.preventDefault();
                const targetElement = document.querySelector(targetId);
                if(targetElement) {
                    targetElement.scrollIntoView({ behavior: 'smooth' });
                }
            }
        });
    });
});