<script>
  import RouterLink from './RouterLink.svelte'
</script>

<style>
  nav {
    flex-basis: 10rem;
    background-color: var(--primary-color);
    color: var(--second-color-4);
    padding: 1rem; 
  }

  nav ul {
    list-style: none;
  }

  nav ul li {
    padding: .5rem 0;
  }
</style>

<nav>
  <h1>Side Navi</h1>
  <ul>
    <li>
      <RouterLink url=''>Main</RouterLink>
    </li>
    <li>
      <RouterLink url='asas'>Sub</RouterLink>
    </li>
  </ul>
</nav>