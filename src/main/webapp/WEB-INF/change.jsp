<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- displays site properly based on user's device -->

    <link rel="icon" type="image/png" sizes="32x32" href="/images/favicon-32x32.png">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Public+Sans:wght@300;400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/scss/style.css">
    <title>Easybank landing page</title>

    <!-- Feel free to remove these styles or customise in your own stylesheet 👍 -->
    <style>
            .attribution {
                font-size: 11px;
                text-align: center;
            }
            .attribution a {
                color: hsl(228, 45%, 44%);
            }
        </style>
</head>
<body>
<header class="header">
    <div class="overlay has-fade"></div>

    <nav class="container container--pall flex flex-jc-sb flex-ai-c">
        <a href="/" class="header__logo">
            <img src="/images/logo.svg" alt="Easybank" />
        </a>
        <a id="btnHamburger" href="#" class="header__toggle hide-for-desktop">
            <span></span>
            <span></span>
            <span></span>
        </a>

        <div class="header__links hide-for-mobile">
            <a href="#">Home</a><a href="#">About</a><a href="#">Contact</a><a href="#">Blog</a><a href="#">Careers</a>
        </div>

        <a href="#" class="button header__cta hide-for-mobile">Request Invite</a>
    </nav>

    <div class="header__menu has-fade">
        <a href="">Home</a>
        <a href="">About</a>
        <a href="">Contact</a>
        <a href="">Blog</a>
        <a href="">Careers</a>
    </div>
</header>

<section class="hero">
    <div class="container">
        <div class="hero__image"></div>
        <div class="hero__text container--pall">
            <h1>Next generation digital banking</h1>
            <p>Take your financial life online. Your Easybank account will be a one-stop-shop for spending, saving, budgeting, investing, and much more.</p>
            <a href="#" class="button hero__cta">Request Invite</a>
        </div>
    </div>
</section>


<div class="attribution">
    Challenge by <a href="https://www.frontendmentor.io?ref=challenge" target="_blank">Frontend Mentor</a>. Coded by <a href="https://github.com/AntiKINACom/easybank-landing-page">AntiKINACom</a>.
</div>

<script src="/js/script.js"></script>
</body>
</html>